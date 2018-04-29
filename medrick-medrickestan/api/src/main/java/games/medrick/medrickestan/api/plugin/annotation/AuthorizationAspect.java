package games.medrick.medrickestan.api.plugin.annotation;

import games.medrick.medrickestan.api.exception.AuthorizationException;
import games.medrick.medrickestan.core.exception.BaseException;
import games.medrick.medrickestan.service.AccountService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * created by Behrooz Bahrame on 2/17/2018
 **/
@Aspect
@Component
public class AuthorizationAspect {
    @Autowired
    private AccountService accountService;

    @Before("@annotation(games.medrick.medrickestan.api.plugin.annotation.Authorization)")
    public void authenticate(JoinPoint call) throws BaseException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        MethodSignature signature = (MethodSignature) call.getSignature();
        Method method = signature.getMethod();
        Authorization myAnnotation = method.getAnnotation(Authorization.class);

        if (myAnnotation.value()) {
            String token = request.getHeader("access-token");
            try {
                if (token != null) {

                    long id = accountService.getPlayeIdFromToken(token);
                    if (id > 0) {
                        request.getSession().setAttribute("playerId", id);
                    } else {
                        throw new AuthorizationException();
                    }
                } else {
                    throw new AuthorizationException();
                }
            } catch (Exception ex) {
                throw new AuthorizationException();
            }
        } else {
            request.getSession().setAttribute("playerId", (long) -1);
        }
    }
}
