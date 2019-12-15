DROP TABLE IF EXISTS user;
CREATE TABLE user(
    id_user INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    username TEXT NOT NULL,
    password TEXT NOT NULL
);

DROP TABLE  IF EXISTS character;
CREATE TABLE character (
    id_character INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    strength INTEGER NOT NULL,
    age INTEGER NOT NULL,
    constitution INTEGER NOT NULL,
    dexterity INTEGER NOT NULL,
    intelligence INTEGER NOT NULL,
    wisdom INTEGER NOT NULL,
    charisma INTEGER NOT NULL
);

