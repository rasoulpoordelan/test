package games.medrick.medrickestan.service.impl;

import games.medrick.medrickestan.core.entity.Admin;
import games.medrick.medrickestan.core.entity.Market;
import games.medrick.medrickestan.core.entity.Player;
import games.medrick.medrickestan.core.entity.PlayerDevice;
import games.medrick.medrickestan.core.memoryRepository.AuthenticationRepository;
import games.medrick.medrickestan.core.model.account.PlayerProfile;
import games.medrick.medrickestan.core.repository.AdminRepository;
import games.medrick.medrickestan.core.repository.PlayerChapterRepository;
import games.medrick.medrickestan.core.repository.PlayerDeviceRepository;
import games.medrick.medrickestan.core.repository.PlayerRepository;
import games.medrick.medrickestan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * created by behroozbahrameh on 2/16/18
 **/

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerDeviceRepository playerDeviceRepository;

    @Autowired
    PlayerChapterRepository playerChapterRepository;

    @Autowired
    AuthenticationRepository authenticationRepository;

    @Autowired
    AdminRepository adminRepository;

    @Override
    public PlayerProfile loginViaUdid(String udid, int clientVersion, short market) {
        PlayerProfile result = new PlayerProfile();

        PlayerDevice playerDevice = playerDeviceRepository.findOneByUdid(udid);

        Player player;

        if (playerDevice == null) {
            playerDevice = new PlayerDevice();
            player = new Player();

            PlayerDevice device = new PlayerDevice();
            playerDevice.setClientVersion(clientVersion);
            playerDevice.setMarket(new Market(market));
            playerDevice.setUdid(udid);
            playerDevice.setPlayer(player);

            player.getDevices().add(playerDevice);

            playerRepository.save(player);

        } else {
            player = playerDevice.getPlayer();
        }

        String token = UUID.randomUUID().toString();

        result.setToken(token);
        result.setId(player.getId());
        result.setNickName(player.getNickName());
        result.setWallet(player.getWallet());

        result.setChapterProgress(
                playerChapterRepository.findAllByPlayer(player)
                        .stream().map(pp -> new long[]{pp.getChapter().getId(), pp.getProgress()}).collect(Collectors.toList()));


        authenticationRepository.save(result.getId(), result.getToken());

        return result;
    }

    @Override
    public PlayerProfile loginViaUserName(String userName, String password, int clientVersion, short market) {
        PlayerProfile result = new PlayerProfile();


        Player player=playerRepository.findByUsername(userName,password);

        if (player == null) {
            player = new Player();
            Admin admin = new Admin(player, userName, password);

            //playerRepository.save(player);
            adminRepository.save(admin);

        }

        String token = UUID.randomUUID().toString();

        result.setToken(token);
        result.setId(player.getId());
        result.setNickName(player.getNickName());
        result.setWallet(player.getWallet());

        result.setChapterProgress(
                playerChapterRepository.findAllByPlayer(player)
                        .stream().map(pp -> new long[]{pp.getChapter().getId(), pp.getProgress()}).collect(Collectors.toList()));

        authenticationRepository.save(result.getId(), result.getToken());

        return result;
    }

    @Override
    public String setNickName(long playerId, String nickName) {

        Player player = playerRepository.getOne(playerId);
        player.setNickName(nickName);
        playerRepository.save(player);

        return player.getNickName();
    }

    @Override
    public long getPlayeIdFromToken(String token) {
        return authenticationRepository.getUser(token);
    }
}
