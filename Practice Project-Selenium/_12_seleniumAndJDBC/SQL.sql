use user_credentials;

CREATE TABLE user_info
(email VARCHAR(255) NOT NULL,
 pass VARCHAR(50) NOT NULL
);

INSERT INTO user_info (email,pass) VALUES ('sampleemail123@gmail.com', 'sample-1234');