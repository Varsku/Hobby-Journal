INSERT INTO harrastus
	(nimi, kuvaus, aika, pvm)
values
	('Musiikki ', 'Soitin bassolla ja kitaralla hieman Metallicaa', 2.0, '23.02.3017'),
	('Pelaaminen', 'Pelailin WoWia, NHl 17 ja LoLia', 6.0, '08.01.2017'),
	('Lenkkeily ', 'Juoksin lenkin hyvällä tahdilla, reitti kulki metsässä sekä tiellä', 1.5, '08.02.2017');
	
	INSERT INTO
	authority
VALUES
	(2,'ROLE_ADMIN'),
	(1,'ROLE_USER');
	

INSERT INTO
	webuser2
VALUES
	(1,'normi','9dadc77391715ed9c8f492d054c3ae24e6a5c8187f59cd9ce47eb4ec32a01a0cd8c036661af3cc4a',1,'Normi','Käyttäjä'),
	(2,'admin','03e31aa6d226aa53e2e323cddfab14111eb7ccd17fbd6f6c7d26a3a370a4fee9f3d061b8e82a4d0a',1,'Admin','Käyttäjä');
	
	
INSERT INTO
	webuser2_authority
VALUES
	(1,1,1),
	(2,2,1),
	(3,2,2);