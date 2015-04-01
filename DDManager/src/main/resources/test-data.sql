insert into HIBERNATE_UNIQUE_KEY (next_hi) values (1);
insert into HIBERNATE_UNIQUE_KEY (next_hi) values (2);
insert into HIBERNATE_UNIQUE_KEY (next_hi) values (3);
insert into HIBERNATE_UNIQUE_KEY (next_hi) values (4);

insert into characters  
(id,name ,playerName , race ,characterClass ,level ,experience ,strength ,constitution ,dexterity ,intelligence ,wisdom ,charisma ,speed ,maxHp ,bloodiedValue ,surgesPerDay ,surgeValue )
values (1,'Rayool','Alexis','DragonBorn','Paladin',7,8625,16,12,11,9,14,15,6,57,28,11,15);

insert into powers (id,name) values (1,'test');
insert into powers (id,name) values (2,'retest');

insert into CHAR_POWER (id_character,id_power) values(1,1);
insert into CHAR_POWER (id_character,id_power) values(1,2);