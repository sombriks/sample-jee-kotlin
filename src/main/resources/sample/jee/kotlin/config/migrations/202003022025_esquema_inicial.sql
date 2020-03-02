-- Migration SQL that makes the change goes here.

create table user(
  id serial not null,
  nome varchar(255) not null,
  primary key (id)
);

-- //@UNDO
-- SQL to undo the change goes here.

drop table user;
