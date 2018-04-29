INSERT INTO market(id, name, platform) VALUES (1, 'CB' , 1)
INSERT INTO market(id, name, platform) VALUES (2, 'baz' , 1)


INSERT INTO player(nick_name, gem, gold, creation_date) VALUES('behrooz' , 1,1,'2017-01-01')

INSERT INTO genre(id, name) VALUES (1, 'drama')
INSERT INTO genre(id, name) VALUES (2, 'horror')

INSERT INTO book(close, cover_image_url, loading_image_url, name, preview_image_url, esra) VALUES (FALSE , 'image 1', 'image 2', 'my book', 'image 3', 1)

INSERT INTO chapter(release_date, gem_price, gold_price, name, status, summery, author_player_id, book_id) VALUES ('2017-01-01', 1, 1, 'chapter 1', 0,'summery', 1,1)
INSERT INTO chapter(release_date, gem_price, gold_price, name, status, summery, author_player_id, book_id) VALUES ('2017-01-01', 1, 1, 'chapter 2', 0,'summery', 1,1)