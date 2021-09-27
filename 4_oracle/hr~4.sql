-- ����(�׷�) �Լ�
select sum(height), sum(weight) from student;
select avg(height) as ���Ű, avg(weight) as ��ո�����, max(height) as "���� ū Ű", min(height) as "���� ���� Ű" from student;

select count(*) from professor;  -- count(*)�� �ϸ� null���� ������ ��ü������ ���´�.
select count(bonus), count(name) from professor; 

select rank(68000000) within group(order by pay desc)
    from emp2;
    
select rank(490) within group(order by pay desc)
    from professor;    
    
select name, pay from professor order by pay desc;

select * from professor; 

select rank(90) within group(order by bonus desc)
    from professor
    where bonus is not null;    
        
-- oracle �� null���� �켱������ ����.
-- mysql�� null���� �켱������ ����
select name, pay, bonus from professor order by bonus desc;    

-- �л� ���� 1, 2, 3]
-- student ���̺�
-- Ű�� 168�λ���� �� ��°�� ū�� Ȯ��
select rank(168) within group(order by height desc)
    from student
    where height is not null;    

-- �����԰� 58�� ����� �� ��°���� ��� ���ϱ�
select rank(58) within group(order by weight desc)
    from student
    where weight is not null;    

-- gift table
-- g_end�� 200000, 600000 ���� ���� �� ��� (any ����� ��)
--select * from gift where g_end >= any(200000) and g_end <= any(600000);
select * from gift where g_end < any(200000, 600000);
select * from gift where g_end > any(200000, 600000);

select * from gift where g_end < all(200000, 600000);
select * from gift where g_end > all(200000, 600000);

select * from gift;

--8. �������� ����
--NOT NULL �ش� �÷��� NULL�� �Է��� �� ������	�÷�
--UNIQUE	�ش� �÷� �Ǵ� �÷� ���� ���� �����ϵ���	�÷�, ���̺�
--PRIMARY KEY	�� ���� �����ϰ� �ĺ��� �� �ֵ���	�÷�, ���̺�
--FOREIGN KEY	�ٸ� ���̺��� �⺻Ű�� ����	�÷�, ���̺�
--CHECK	�ش� �÷��� Ư�� ������ �׻� ������Ű����	�÷�, ���̺�
--constraint ��Ī primary key, ��Ī : ���̺��_�ʵ��_���� ��)board_id_pk
create table userlist(
    id varchar2(10) constraint id_pk primary key, -- �⺻Ű, �ߺ��ȵǰ� NOT NULL ��
    name varchar2(10) -- not null 
);

select * from userlist;
insert into userlist values('kingsmile', 'doyeon');
insert into userlist(id) values('gildong');
insert into userlist(name) values('hello');

CREATE TABLE fk_member(
    code number(2) NOT NULL,
    id VARCHAR2(20) NOT NULL
    CONSTRAINT id_fk REFERENCES MEMBER(id),
    etc VARCHAR2(10)
);

select * from member;
desc member;

CREATE TABLE userlist2(
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY KEY, -- �ߺ� �ȵ�, null ��� �ȵ�
    jumin char(13) CONSTRAINT jumin_un unique -- null ���, �ߺ��� �ȵ�
);

select * from userlist2;
insert into userlist2 values('kingsmile', '1234');
insert into userlist2(id) values('gildong');
insert into userlist2(id, jumin) values('gildong2', '12345');
insert into userlist2 values('happy', '1004');

