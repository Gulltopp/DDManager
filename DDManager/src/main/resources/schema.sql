create table CHARACTERS (id INTEGER,name VARCHAR(30),playerName VARCHAR(30), race VARCHAR(30), characterClass VARCHAR(30),level INTEGER,experience INTEGER,strength INTEGER,constitution INTEGER,dexterity INTEGER,intelligence INTEGER,wisdom INTEGER,charisma INTEGER,speed INTEGER,maxHp INTEGER,bloodiedValue INTEGER,surgesPerDay INTEGER,surgeValue INTEGER);
create table POWERS (id INTEGER,name VARCHAR(30));
create table CHAR_POWER (id_character INTEGER,id_power INTEGER);


create table HIBERNATE_UNIQUE_KEY (next_hi INTEGER); 