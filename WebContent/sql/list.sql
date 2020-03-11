create table Rcp(
	rcpNum INT NOT NULL,
	title varchar(20),
	foodName varchar(30),
	subtitle varchar(30),
	ingredient varchar(1000),
	cookingTime varchar(30),
	memId varchar(20),
	reg_date date,
	thumbNail varchar(30),
	hashtag varchar(1000),
	PRIMARY KEY(rcpNum)
);
insert into Rcp values(1, '밥반찬 뚝딱 두부부침', '두부부침', '계란물에 적신 두부', '두부#계란#고추가루#간장#참기름', '10분', 'aaa', sysdate, 'bbb', '두부부침#밥반찬#한식#간단요리');
drop table rcp;
delete from rcp;
select * from RCP;