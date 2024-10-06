create table avenger (
    id bigserial not null,
    nick varchar(36) UNIQUE,
    person varchar(128),
    description varchar(128),
    history text
    primary key (id)
);