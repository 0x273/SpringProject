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
insert into Rcp values(1, '����� �ҵ� �κκ�ħ', '�κκ�ħ', '������� ���� �κ�', '�κ�#���#���߰���#����#���⸧', '10��', 'aaa', sysdate, 'bbb', '�κκ�ħ#�����#�ѽ�#���ܿ丮');
drop table rcp;
delete from rcp;
select * from RCP;