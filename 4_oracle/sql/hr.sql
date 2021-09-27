select * from tab;
select * from emp2;
select * from dept2;
select sysdate from emp2; -- 

/*
create table ���̺��̸�(
�÷��� datatype [ null | not null ] [ constraint ��Ī��������] ,
�÷��� datatype [ null | not null ] [ constraint ��Ī��������] ,
.....
)
*/

select * from test;
create table Test (
    name VARCHAR2(10), 
    age number(3)
);
-- insert
-- INSERT INTO ���̺�� VALUES (��ü COLUMN�� ���� VALUE_LIST);
insert into test values('aa', 10);
insert into test(age, name) values(20, 'bb');
delete from test where name='bb';

insert into test(name) values('cc');
insert into test(age) values(33);

-- ���̺� ���� drop
drop table test;
select * from test;
create table Test (
    name VARCHAR2(10) not null, 
    age number(3)
);

-- select ��ɾ�
select * from emp2;
select empno, name, deptno from emp2;

select * 
    from emp2
    where name like '��%'; -- % : ���, _ : �ѹ��� <== like �� �Բ� ���
    
select * 
    from emp2
    where name like '_��_';

select * 
    from emp2
    where name like '___'; -- �̸��� �������� ��� �˻�
    
select * 
    from professor
    where name like '__'; -- �̸��� �α����� ��� �˻�
    
select * 
    from professor    
    order by name; -- ���� - �������� : asc , �������� : desc  -- ������ ��������
    
select * 
    from professor    
    order by name desc, pay desc, position; -- ���� - ��������    
    
select * 
    from professor    
    order by 2 desc, 5 desc, 4;
    
select * 
    from professor    
    where deptno like '1%'
    order by 2 desc, 5 desc, 4;    
    
select name, empno--, position
    from emp2
    where position='����';
    
select *
    from professor
    where pay >= 350
    -- where pay <= 350;
    order by pay; -- asc : �������� , desc
    
select *
    from emp2
    where hobby = '����' or hobby='���';
    
select *
    from emp2
    where emp_type='������' and hobby='����';   
    
-- as, ""���� �̿��ؼ� ��Ī ����� �α�
select empno as "�����ȣ", name "��   ��", position ����, pay "��   ��"    
    from emp2;
    
-- || ��������ȣ�� �̿��� ����� ������ �� �ִ�.
select name || ' ' || position || '��'
    from professor;
    
select emp_type from emp2;    
-- distinct �ߺ� ����
select distinct emp_type from emp2; 
    

    







