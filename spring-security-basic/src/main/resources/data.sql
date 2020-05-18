
INSERT into users(username,password,email,enabled) values ('siva','{noop}secret','siva@gmail.com',true);
INSERT into users(username,password,email,enabled) values ('user','s{noop}ecret','user@gmail.com',true);
INSERT into users(username,password,email,enabled) values ('admin','{noop}secret','admin@gmail.com',true);
INSERT into authorities values ('user','USER');
INSERT into authorities values ('admin','ADMIN');
INSERT into authorities values ('siva','ADMIN');

