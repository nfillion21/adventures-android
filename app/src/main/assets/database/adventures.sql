PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE characters (id integer primary key not null, name text not null);
INSERT INTO characters VALUES(1,'leonardo');
INSERT INTO characters VALUES(2,'michaelangelo');
INSERT INTO characters VALUES(3,'suzie cue');
INSERT INTO characters VALUES(4,'april o neil');
INSERT INTO characters VALUES(5,'splinter');
INSERT INTO characters VALUES(6,'raphael');
INSERT INTO characters VALUES(7,'donatello');
INSERT INTO characters VALUES(8,'shredder');
INSERT INTO characters VALUES(9,'bebop');
INSERT INTO characters VALUES(10,'krang');
INSERT INTO characters VALUES(11,'rocksteady');
INSERT INTO characters VALUES(12,'irma');
INSERT INTO characters VALUES(13,'vernon');
INSERT INTO characters VALUES(14,'mr thompson');
INSERT INTO characters VALUES(15,'smash');
INSERT INTO characters VALUES(16,'tiffany');
CREATE TABLE panels (id integer primary key not null, page_id integer not null, number integer not null);
INSERT INTO panels VALUES(1,1,1);
INSERT INTO panels VALUES(2,1,2);
INSERT INTO panels VALUES(3,1,3);
INSERT INTO panels VALUES(4,2,1);
INSERT INTO panels VALUES(5,2,2);
INSERT INTO panels VALUES(6,2,3);
INSERT INTO panels VALUES(7,2,4);
INSERT INTO panels VALUES(8,2,5);
INSERT INTO panels VALUES(9,2,6);
INSERT INTO panels VALUES(10,3,1);
INSERT INTO panels VALUES(11,3,2);
INSERT INTO panels VALUES(12,3,3);
INSERT INTO panels VALUES(13,3,4);
INSERT INTO panels VALUES(14,3,5);
INSERT INTO panels VALUES(15,4,1);
INSERT INTO panels VALUES(16,4,2);
INSERT INTO panels VALUES(17,4,3);
INSERT INTO panels VALUES(18,4,4);
INSERT INTO panels VALUES(19,4,5);
INSERT INTO panels VALUES(20,4,6);
INSERT INTO panels VALUES(21,5,1);
INSERT INTO panels VALUES(22,5,2);
INSERT INTO panels VALUES(23,5,3);
INSERT INTO panels VALUES(24,5,4);
INSERT INTO panels VALUES(25,5,5);
INSERT INTO panels VALUES(26,5,6);
INSERT INTO panels VALUES(27,6,1);
INSERT INTO panels VALUES(28,6,2);
INSERT INTO panels VALUES(29,6,3);
INSERT INTO panels VALUES(30,6,4);
INSERT INTO panels VALUES(31,6,5);
INSERT INTO panels VALUES(32,7,1);
INSERT INTO panels VALUES(33,7,2);
INSERT INTO panels VALUES(34,7,3);
INSERT INTO panels VALUES(35,7,4);
INSERT INTO panels VALUES(36,7,5);
INSERT INTO panels VALUES(37,8,1);
INSERT INTO panels VALUES(38,8,2);
INSERT INTO panels VALUES(39,8,3);
INSERT INTO panels VALUES(40,8,4);
INSERT INTO panels VALUES(41,8,5);
INSERT INTO panels VALUES(42,9,1);
INSERT INTO panels VALUES(43,9,2);
INSERT INTO panels VALUES(44,9,3);
INSERT INTO panels VALUES(45,10,1);
INSERT INTO panels VALUES(46,10,2);
INSERT INTO panels VALUES(47,10,3);
INSERT INTO panels VALUES(48,10,4);
INSERT INTO panels VALUES(49,10,5);
INSERT INTO panels VALUES(50,10,6);
INSERT INTO panels VALUES(51,11,1);
INSERT INTO panels VALUES(52,11,2);
INSERT INTO panels VALUES(53,11,3);
INSERT INTO panels VALUES(54,11,4);
INSERT INTO panels VALUES(55,11,5);
INSERT INTO panels VALUES(56,12,1);
INSERT INTO panels VALUES(57,12,2);
INSERT INTO panels VALUES(58,12,3);
INSERT INTO panels VALUES(59,12,4);
INSERT INTO panels VALUES(60,12,5);
INSERT INTO panels VALUES(61,12,6);
INSERT INTO panels VALUES(62,13,1);
INSERT INTO panels VALUES(63,13,2);
INSERT INTO panels VALUES(64,13,3);
INSERT INTO panels VALUES(65,13,4);
INSERT INTO panels VALUES(66,13,5);
INSERT INTO panels VALUES(67,14,1);
INSERT INTO panels VALUES(68,14,2);
INSERT INTO panels VALUES(69,14,3);
INSERT INTO panels VALUES(70,14,4);
INSERT INTO panels VALUES(71,14,5);
INSERT INTO panels VALUES(72,15,1);
INSERT INTO panels VALUES(73,15,2);
INSERT INTO panels VALUES(74,15,3);
INSERT INTO panels VALUES(75,15,4);
INSERT INTO panels VALUES(76,15,5);
INSERT INTO panels VALUES(77,15,6);
INSERT INTO panels VALUES(78,16,1);
INSERT INTO panels VALUES(79,16,2);
INSERT INTO panels VALUES(80,16,3);
INSERT INTO panels VALUES(81,16,4);
INSERT INTO panels VALUES(82,16,5);
INSERT INTO panels VALUES(83,17,1);
INSERT INTO panels VALUES(84,17,2);
INSERT INTO panels VALUES(85,17,3);
INSERT INTO panels VALUES(86,17,4);
INSERT INTO panels VALUES(87,17,5);
INSERT INTO panels VALUES(88,18,1);
INSERT INTO panels VALUES(89,18,2);
INSERT INTO panels VALUES(90,18,3);
INSERT INTO panels VALUES(91,18,4);
INSERT INTO panels VALUES(92,18,5);
INSERT INTO panels VALUES(93,18,6);
INSERT INTO panels VALUES(94,19,1);
INSERT INTO panels VALUES(95,19,2);
INSERT INTO panels VALUES(96,19,3);
INSERT INTO panels VALUES(97,19,4);
INSERT INTO panels VALUES(98,19,5);
INSERT INTO panels VALUES(99,19,6);
INSERT INTO panels VALUES(100,20,1);
INSERT INTO panels VALUES(101,20,2);
INSERT INTO panels VALUES(102,20,3);
INSERT INTO panels VALUES(103,20,4);
INSERT INTO panels VALUES(104,20,5);
INSERT INTO panels VALUES(105,21,1);
INSERT INTO panels VALUES(106,21,2);
INSERT INTO panels VALUES(107,21,3);
INSERT INTO panels VALUES(108,21,4);
INSERT INTO panels VALUES(109,21,5);
INSERT INTO panels VALUES(110,22,1);
INSERT INTO panels VALUES(111,22,2);
INSERT INTO panels VALUES(112,22,3);
INSERT INTO panels VALUES(113,22,4);
INSERT INTO panels VALUES(114,22,5);
INSERT INTO panels VALUES(115,22,6);
INSERT INTO panels VALUES(116,23,1);
INSERT INTO panels VALUES(117,23,2);
INSERT INTO panels VALUES(118,23,3);
INSERT INTO panels VALUES(119,23,4);
INSERT INTO panels VALUES(120,23,5);
INSERT INTO panels VALUES(121,23,6);
INSERT INTO panels VALUES(122,24,1);
INSERT INTO panels VALUES(123,24,2);
INSERT INTO panels VALUES(124,24,3);
INSERT INTO panels VALUES(125,24,4);
INSERT INTO panels VALUES(126,25,1);
INSERT INTO panels VALUES(127,25,2);
INSERT INTO panels VALUES(128,25,3);
INSERT INTO panels VALUES(129,25,4);
INSERT INTO panels VALUES(130,25,5);
INSERT INTO panels VALUES(131,25,6);
INSERT INTO panels VALUES(132,26,1);
INSERT INTO panels VALUES(133,26,2);
INSERT INTO panels VALUES(134,26,3);
INSERT INTO panels VALUES(135,26,4);
INSERT INTO panels VALUES(136,26,5);
INSERT INTO panels VALUES(137,26,6);
INSERT INTO panels VALUES(138,27,1);
INSERT INTO panels VALUES(139,27,2);
INSERT INTO panels VALUES(140,27,3);
INSERT INTO panels VALUES(141,27,4);
INSERT INTO panels VALUES(142,27,5);
INSERT INTO panels VALUES(143,27,6);
INSERT INTO panels VALUES(144,28,1);
INSERT INTO panels VALUES(145,28,2);
INSERT INTO panels VALUES(146,28,3);
INSERT INTO panels VALUES(147,28,4);
INSERT INTO panels VALUES(148,28,5);
INSERT INTO panels VALUES(149,28,6);
CREATE TABLE pages (id integer primary key not null, issue_id integer not null, number integer not null);
INSERT INTO pages VALUES(1,1,1);
INSERT INTO pages VALUES(2,1,2);
INSERT INTO pages VALUES(3,1,3);
INSERT INTO pages VALUES(4,1,4);
INSERT INTO pages VALUES(5,1,5);
INSERT INTO pages VALUES(6,1,6);
INSERT INTO pages VALUES(7,1,7);
INSERT INTO pages VALUES(8,1,8);
INSERT INTO pages VALUES(9,1,9);
INSERT INTO pages VALUES(10,1,10);
INSERT INTO pages VALUES(11,1,11);
INSERT INTO pages VALUES(12,1,12);
INSERT INTO pages VALUES(13,1,13);
INSERT INTO pages VALUES(14,1,14);
INSERT INTO pages VALUES(15,1,15);
INSERT INTO pages VALUES(16,1,16);
INSERT INTO pages VALUES(17,1,17);
INSERT INTO pages VALUES(18,1,18);
INSERT INTO pages VALUES(19,1,19);
INSERT INTO pages VALUES(20,1,20);
INSERT INTO pages VALUES(21,1,21);
INSERT INTO pages VALUES(22,1,22);
INSERT INTO pages VALUES(23,1,23);
INSERT INTO pages VALUES(24,1,24);
INSERT INTO pages VALUES(25,1,25);
INSERT INTO pages VALUES(26,1,26);
INSERT INTO pages VALUES(27,1,27);
INSERT INTO pages VALUES(28,1,28);
INSERT INTO pages VALUES(29,2,1);
INSERT INTO pages VALUES(30,2,2);
INSERT INTO pages VALUES(31,2,3);
INSERT INTO pages VALUES(32,2,4);
INSERT INTO pages VALUES(33,2,5);
INSERT INTO pages VALUES(34,2,6);
INSERT INTO pages VALUES(35,2,7);
INSERT INTO pages VALUES(36,2,8);
INSERT INTO pages VALUES(37,2,9);
INSERT INTO pages VALUES(38,2,10);
INSERT INTO pages VALUES(39,2,11);
INSERT INTO pages VALUES(40,2,12);
INSERT INTO pages VALUES(41,2,13);
INSERT INTO pages VALUES(42,2,14);
INSERT INTO pages VALUES(43,2,15);
INSERT INTO pages VALUES(44,2,16);
INSERT INTO pages VALUES(45,2,17);
INSERT INTO pages VALUES(46,2,18);
INSERT INTO pages VALUES(47,2,19);
INSERT INTO pages VALUES(48,2,20);
INSERT INTO pages VALUES(49,2,21);
INSERT INTO pages VALUES(50,2,22);
INSERT INTO pages VALUES(51,2,23);
INSERT INTO pages VALUES(52,2,24);
INSERT INTO pages VALUES(53,2,25);
INSERT INTO pages VALUES(54,2,26);
INSERT INTO pages VALUES(55,2,27);
INSERT INTO pages VALUES(56,2,28);
INSERT INTO pages VALUES(57,3,1);
INSERT INTO pages VALUES(58,3,2);
INSERT INTO pages VALUES(59,3,3);
INSERT INTO pages VALUES(60,3,4);
INSERT INTO pages VALUES(61,3,5);
INSERT INTO pages VALUES(62,3,6);
INSERT INTO pages VALUES(63,3,7);
INSERT INTO pages VALUES(64,3,8);
INSERT INTO pages VALUES(65,3,9);
INSERT INTO pages VALUES(66,3,10);
INSERT INTO pages VALUES(67,3,11);
INSERT INTO pages VALUES(68,3,12);
INSERT INTO pages VALUES(69,3,13);
INSERT INTO pages VALUES(70,3,14);
INSERT INTO pages VALUES(71,3,15);
INSERT INTO pages VALUES(72,3,16);
INSERT INTO pages VALUES(73,3,17);
INSERT INTO pages VALUES(74,3,18);
INSERT INTO pages VALUES(75,3,19);
INSERT INTO pages VALUES(76,3,20);
INSERT INTO pages VALUES(77,3,21);
INSERT INTO pages VALUES(78,3,22);
INSERT INTO pages VALUES(79,3,23);
INSERT INTO pages VALUES(80,3,24);
INSERT INTO pages VALUES(81,3,25);
INSERT INTO pages VALUES(82,3,26);
INSERT INTO pages VALUES(83,3,27);
INSERT INTO pages VALUES(84,3,28);
INSERT INTO pages VALUES(85,4,1);
INSERT INTO pages VALUES(86,4,2);
INSERT INTO pages VALUES(87,4,3);
INSERT INTO pages VALUES(88,4,4);
INSERT INTO pages VALUES(89,4,5);
INSERT INTO pages VALUES(90,4,6);
INSERT INTO pages VALUES(91,4,7);
INSERT INTO pages VALUES(92,4,8);
INSERT INTO pages VALUES(93,4,9);
INSERT INTO pages VALUES(94,4,10);
INSERT INTO pages VALUES(95,4,11);
INSERT INTO pages VALUES(96,4,12);
INSERT INTO pages VALUES(97,4,13);
INSERT INTO pages VALUES(98,4,14);
INSERT INTO pages VALUES(99,4,15);
INSERT INTO pages VALUES(100,4,16);
INSERT INTO pages VALUES(101,4,17);
INSERT INTO pages VALUES(102,4,18);
INSERT INTO pages VALUES(103,4,19);
INSERT INTO pages VALUES(104,4,20);
INSERT INTO pages VALUES(105,4,21);
INSERT INTO pages VALUES(106,4,22);
INSERT INTO pages VALUES(107,4,23);
INSERT INTO pages VALUES(108,4,24);
INSERT INTO pages VALUES(109,4,25);
INSERT INTO pages VALUES(110,4,26);
INSERT INTO pages VALUES(111,4,27);
INSERT INTO pages VALUES(112,4,28);
CREATE TABLE issues (id integer primary key not null, book_id integer not null, title text not null, number integer not null);
INSERT INTO issues VALUES(1,1,'return of the shredder',1);
INSERT INTO issues VALUES(2,1,'return of the shredder part II',2);
INSERT INTO issues VALUES(3,1,'the incredible shrinking turtles part 1',3);
INSERT INTO issues VALUES(4,1,'the incredible shrinking turtles part 2',4);
CREATE TABLE books (id integer primary key not null, volume int not null, title text not null);
INSERT INTO books VALUES(1,1,'default');
INSERT INTO books VALUES(2,2,'default');
INSERT INTO books VALUES(3,3,'default');
INSERT INTO books VALUES(4,4,'default');
INSERT INTO books VALUES(5,5,'default');
INSERT INTO books VALUES(6,6,'default');
INSERT INTO books VALUES(7,7,'default');
INSERT INTO books VALUES(8,8,'default');
INSERT INTO books VALUES(9,9,'default');
INSERT INTO books VALUES(10,10,'default');
INSERT INTO books VALUES(11,11,'default');
INSERT INTO books VALUES(12,12,'default');
INSERT INTO books VALUES(13,13,'default');
INSERT INTO books VALUES(14,14,'default');
INSERT INTO books VALUES(15,15,'default');
INSERT INTO books VALUES(16,16,'default');
CREATE TABLE characters_panels (character_id integer not null, panel_id integer not null, primary key (character_id, panel_id));
INSERT INTO characters_panels VALUES(1,1);
INSERT INTO characters_panels VALUES(2,1);
INSERT INTO characters_panels VALUES(1,2);
INSERT INTO characters_panels VALUES(2,2);
INSERT INTO characters_panels VALUES(3,4);
INSERT INTO characters_panels VALUES(3,5);
INSERT INTO characters_panels VALUES(1,6);
INSERT INTO characters_panels VALUES(2,6);
INSERT INTO characters_panels VALUES(1,7);
INSERT INTO characters_panels VALUES(2,7);
INSERT INTO characters_panels VALUES(1,8);
INSERT INTO characters_panels VALUES(2,8);
INSERT INTO characters_panels VALUES(3,8);
INSERT INTO characters_panels VALUES(3,9);
INSERT INTO characters_panels VALUES(1,10);
INSERT INTO characters_panels VALUES(2,10);
INSERT INTO characters_panels VALUES(2,12);
INSERT INTO characters_panels VALUES(2,13);
INSERT INTO characters_panels VALUES(2,14);
INSERT INTO characters_panels VALUES(2,15);
INSERT INTO characters_panels VALUES(1,17);
INSERT INTO characters_panels VALUES(1,18);
INSERT INTO characters_panels VALUES(1,20);
INSERT INTO characters_panels VALUES(1,21);
INSERT INTO characters_panels VALUES(2,21);
INSERT INTO characters_panels VALUES(1,22);
INSERT INTO characters_panels VALUES(1,23);
INSERT INTO characters_panels VALUES(1,24);
INSERT INTO characters_panels VALUES(2,24);
INSERT INTO characters_panels VALUES(1,25);
INSERT INTO characters_panels VALUES(3,25);
INSERT INTO characters_panels VALUES(1,26);
INSERT INTO characters_panels VALUES(2,26);
INSERT INTO characters_panels VALUES(3,26);
INSERT INTO characters_panels VALUES(1,27);
INSERT INTO characters_panels VALUES(2,27);
INSERT INTO characters_panels VALUES(1,28);
INSERT INTO characters_panels VALUES(2,28);
INSERT INTO characters_panels VALUES(1,29);
INSERT INTO characters_panels VALUES(2,29);
INSERT INTO characters_panels VALUES(3,32);
INSERT INTO characters_panels VALUES(4,32);
INSERT INTO characters_panels VALUES(3,33);
INSERT INTO characters_panels VALUES(4,33);
INSERT INTO characters_panels VALUES(3,34);
INSERT INTO characters_panels VALUES(3,35);
INSERT INTO characters_panels VALUES(3,36);
INSERT INTO characters_panels VALUES(4,36);
INSERT INTO characters_panels VALUES(5,37);
INSERT INTO characters_panels VALUES(1,38);
INSERT INTO characters_panels VALUES(2,38);
INSERT INTO characters_panels VALUES(6,38);
INSERT INTO characters_panels VALUES(1,39);
INSERT INTO characters_panels VALUES(2,39);
INSERT INTO characters_panels VALUES(6,39);
INSERT INTO characters_panels VALUES(1,40);
INSERT INTO characters_panels VALUES(2,40);
INSERT INTO characters_panels VALUES(6,40);
INSERT INTO characters_panels VALUES(7,40);
INSERT INTO characters_panels VALUES(1,41);
INSERT INTO characters_panels VALUES(2,41);
INSERT INTO characters_panels VALUES(6,41);
INSERT INTO characters_panels VALUES(7,41);
INSERT INTO characters_panels VALUES(8,43);
INSERT INTO characters_panels VALUES(9,43);
INSERT INTO characters_panels VALUES(10,43);
INSERT INTO characters_panels VALUES(11,43);
INSERT INTO characters_panels VALUES(10,44);
INSERT INTO characters_panels VALUES(8,45);
INSERT INTO characters_panels VALUES(9,46);
INSERT INTO characters_panels VALUES(11,46);
INSERT INTO characters_panels VALUES(8,47);
INSERT INTO characters_panels VALUES(10,47);
INSERT INTO characters_panels VALUES(8,48);
INSERT INTO characters_panels VALUES(10,48);
INSERT INTO characters_panels VALUES(10,49);
INSERT INTO characters_panels VALUES(9,49);
INSERT INTO characters_panels VALUES(11,49);
INSERT INTO characters_panels VALUES(11,50);
INSERT INTO characters_panels VALUES(9,50);
INSERT INTO characters_panels VALUES(9,51);
INSERT INTO characters_panels VALUES(11,51);
INSERT INTO characters_panels VALUES(10,52);
INSERT INTO characters_panels VALUES(4,53);
INSERT INTO characters_panels VALUES(12,53);
INSERT INTO characters_panels VALUES(12,54);
INSERT INTO characters_panels VALUES(13,54);
INSERT INTO characters_panels VALUES(4,55);
INSERT INTO characters_panels VALUES(12,55);
INSERT INTO characters_panels VALUES(13,55);
INSERT INTO characters_panels VALUES(14,56);
INSERT INTO characters_panels VALUES(4,57);
INSERT INTO characters_panels VALUES(12,57);
INSERT INTO characters_panels VALUES(14,58);
INSERT INTO characters_panels VALUES(4,58);
INSERT INTO characters_panels VALUES(14,59);
INSERT INTO characters_panels VALUES(4,59);
INSERT INTO characters_panels VALUES(14,60);
INSERT INTO characters_panels VALUES(13,60);
INSERT INTO characters_panels VALUES(4,61);
INSERT INTO characters_panels VALUES(12,61);
INSERT INTO characters_panels VALUES(10,51);
INSERT INTO characters_panels VALUES(16,62);
INSERT INTO characters_panels VALUES(14,62);
INSERT INTO characters_panels VALUES(16,63);
INSERT INTO characters_panels VALUES(14,63);
INSERT INTO characters_panels VALUES(4,64);
INSERT INTO characters_panels VALUES(16,64);
INSERT INTO characters_panels VALUES(14,64);
INSERT INTO characters_panels VALUES(4,65);
INSERT INTO characters_panels VALUES(13,65);
INSERT INTO characters_panels VALUES(13,66);
INSERT INTO characters_panels VALUES(4,66);
INSERT INTO characters_panels VALUES(12,66);
INSERT INTO characters_panels VALUES(5,67);
INSERT INTO characters_panels VALUES(5,68);
INSERT INTO characters_panels VALUES(1,69);
INSERT INTO characters_panels VALUES(2,69);
INSERT INTO characters_panels VALUES(6,69);
INSERT INTO characters_panels VALUES(7,69);
INSERT INTO characters_panels VALUES(1,70);
INSERT INTO characters_panels VALUES(2,70);
INSERT INTO characters_panels VALUES(6,70);
INSERT INTO characters_panels VALUES(7,70);
INSERT INTO characters_panels VALUES(5,70);
INSERT INTO characters_panels VALUES(5,71);
INSERT INTO characters_panels VALUES(5,72);
INSERT INTO characters_panels VALUES(2,72);
INSERT INTO characters_panels VALUES(1,73);
INSERT INTO characters_panels VALUES(2,73);
INSERT INTO characters_panels VALUES(5,73);
INSERT INTO characters_panels VALUES(6,73);
INSERT INTO characters_panels VALUES(7,73);
INSERT INTO characters_panels VALUES(8,76);
INSERT INTO characters_panels VALUES(8,77);
INSERT INTO characters_panels VALUES(8,78);
INSERT INTO characters_panels VALUES(8,79);
INSERT INTO characters_panels VALUES(8,80);
INSERT INTO characters_panels VALUES(8,81);
INSERT INTO characters_panels VALUES(8,82);
INSERT INTO characters_panels VALUES(8,83);
INSERT INTO characters_panels VALUES(8,84);
INSERT INTO characters_panels VALUES(8,87);
INSERT INTO characters_panels VALUES(8,88);
INSERT INTO characters_panels VALUES(8,89);
INSERT INTO characters_panels VALUES(8,91);
INSERT INTO characters_panels VALUES(8,92);
INSERT INTO characters_panels VALUES(10,93);
INSERT INTO characters_panels VALUES(8,93);
INSERT INTO characters_panels VALUES(10,94);
INSERT INTO characters_panels VALUES(8,94);
INSERT INTO characters_panels VALUES(8,95);
INSERT INTO characters_panels VALUES(8,96);
INSERT INTO characters_panels VALUES(15,97);
INSERT INTO characters_panels VALUES(8,97);
INSERT INTO characters_panels VALUES(15,98);
INSERT INTO characters_panels VALUES(8,99);
INSERT INTO characters_panels VALUES(15,100);
INSERT INTO characters_panels VALUES(8,101);
INSERT INTO characters_panels VALUES(8,102);
INSERT INTO characters_panels VALUES(8,103);
INSERT INTO characters_panels VALUES(8,104);
INSERT INTO characters_panels VALUES(15,104);
INSERT INTO characters_panels VALUES(4,105);
INSERT INTO characters_panels VALUES(12,105);
INSERT INTO characters_panels VALUES(13,105);
INSERT INTO characters_panels VALUES(12,106);
INSERT INTO characters_panels VALUES(12,107);
INSERT INTO characters_panels VALUES(4,107);
INSERT INTO characters_panels VALUES(13,108);
INSERT INTO characters_panels VALUES(14,108);
INSERT INTO characters_panels VALUES(14,109);
INSERT INTO characters_panels VALUES(13,110);
INSERT INTO characters_panels VALUES(13,111);
INSERT INTO characters_panels VALUES(13,112);
INSERT INTO characters_panels VALUES(13,113);
INSERT INTO characters_panels VALUES(13,114);
INSERT INTO characters_panels VALUES(14,114);
INSERT INTO characters_panels VALUES(14,115);
INSERT INTO characters_panels VALUES(13,115);
INSERT INTO characters_panels VALUES(4,116);
INSERT INTO characters_panels VALUES(4,117);
INSERT INTO characters_panels VALUES(14,117);
INSERT INTO characters_panels VALUES(14,118);
INSERT INTO characters_panels VALUES(4,118);
INSERT INTO characters_panels VALUES(16,118);
INSERT INTO characters_panels VALUES(14,119);
INSERT INTO characters_panels VALUES(4,119);
INSERT INTO characters_panels VALUES(16,120);
INSERT INTO characters_panels VALUES(14,120);
INSERT INTO characters_panels VALUES(14,121);
INSERT INTO characters_panels VALUES(16,121);
INSERT INTO characters_panels VALUES(4,121);
INSERT INTO characters_panels VALUES(8,122);
INSERT INTO characters_panels VALUES(15,123);
INSERT INTO characters_panels VALUES(8,124);
INSERT INTO characters_panels VALUES(15,125);
INSERT INTO characters_panels VALUES(15,126);
INSERT INTO characters_panels VALUES(15,127);
INSERT INTO characters_panels VALUES(3,127);
INSERT INTO characters_panels VALUES(3,128);
INSERT INTO characters_panels VALUES(15,128);
INSERT INTO characters_panels VALUES(3,129);
INSERT INTO characters_panels VALUES(15,130);
INSERT INTO characters_panels VALUES(15,131);
INSERT INTO characters_panels VALUES(15,132);
INSERT INTO characters_panels VALUES(4,134);
INSERT INTO characters_panels VALUES(13,134);
INSERT INTO characters_panels VALUES(4,135);
INSERT INTO characters_panels VALUES(13,135);
INSERT INTO characters_panels VALUES(15,135);
INSERT INTO characters_panels VALUES(13,136);
INSERT INTO characters_panels VALUES(4,136);
INSERT INTO characters_panels VALUES(4,137);
INSERT INTO characters_panels VALUES(13,137);
INSERT INTO characters_panels VALUES(8,138);
INSERT INTO characters_panels VALUES(9,139);
INSERT INTO characters_panels VALUES(10,139);
INSERT INTO characters_panels VALUES(11,139);
INSERT INTO characters_panels VALUES(8,140);
INSERT INTO characters_panels VALUES(10,140);
INSERT INTO characters_panels VALUES(8,141);
INSERT INTO characters_panels VALUES(10,142);
INSERT INTO characters_panels VALUES(10,143);
INSERT INTO characters_panels VALUES(10,144);
INSERT INTO characters_panels VALUES(9,144);
INSERT INTO characters_panels VALUES(10,145);
INSERT INTO characters_panels VALUES(11,145);
INSERT INTO characters_panels VALUES(11,146);
INSERT INTO characters_panels VALUES(9,146);
INSERT INTO characters_panels VALUES(9,147);
INSERT INTO characters_panels VALUES(10,147);
INSERT INTO characters_panels VALUES(11,147);
INSERT INTO characters_panels VALUES(10,148);
INSERT INTO characters_panels VALUES(8,149);
COMMIT;
