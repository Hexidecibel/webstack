create table tg_user(
    user_id serial8 primary key,
    user_name varchar not null,
    first_name varchar not null,
    middle_name varchar,
    last_name varchar not null,
    password_hash varchar not null,
    added_at timestamp with time zone not null,
    modified_at timestamp with time zone default current_timestamp
);
