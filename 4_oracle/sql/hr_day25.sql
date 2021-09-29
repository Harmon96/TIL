-- decode
SELECT deptno, DECODE(deptno, 10 , 'ACCOUNTING' ,
                              20 , 'RESEARCH' ,
                              30 , 'SALES', 'OPERATIONS') name
  FROM dept;


SELECT deptno, DECODE(deptno, 10 , SUM(sal),
??????????????????????????????20 , MAX(sal),
??????????????????????????????30 , MIN(sal),
                              40 , avg(sal)) sal
??FROM emp
?GROUP BY deptno; 

SELECT deptno, DECODE(deptno, 10 , SUM(sal),
??????????????????????????????20 , MAX(sal),
??????????????????????????????30 , MIN(sal)) sal
??FROM emp
?GROUP BY deptno; 


SELECT deptno, 
       CASE deptno
         WHEN 10 THEN 'ACCOUNTING'
         WHEN 20 THEN 'RESEARCH'
         WHEN 30 THEN 'SALES'
         ELSE 'OPERATIONS'
       END as "Dept Name"
  FROM dept;

 
SELECT * FROM emp;

-- ���̺� ����   
/* ����>
create table ���̺��̸�
    select �÷���, ... from ���̺��̸�
*/


create table c_emp
    as select * from emp;
    
create table c_emp_20
    as select * from emp where deptno=20;
    
create table c_emp_30
    as select empno ��ȣ, ename �̸�, job ����, sal �޿�
        from emp where deptno=30;
    
--����1] �������̺��� ���Ӱ��縸 �����ؼ� ���̺� �����ϱ�
select * from professor;

create table professor2
    as select * from professor where position='���Ӱ���';

select * from professor2;

--����2] emp(����) ���̺��� mgr(�Ŵ�����ȣ)�� 7566���� ����� �����ؼ� ���ο� ���̺� �����ϱ�
select * from emp;
    
create table c_emp_7566
    as select * from emp where mgr=7566;
    
select * from c_emp_7566;    

create table c_emp3
    as select * from emp where 1=0;
    
create table c_emp4
    as select * from emp
        order by ename desc, sal desc, empno asc;
    
select * from c_emp4;

desc demp2;

select * from c_emp; -- ��ü����
select * from c_emp_20; -- ����(�μ���ȣ�� 20���� ���ڵ�) �� �°� ���̺� ����
select * from c_emp3; -- �������� ���� (���ڵ� ���� ����)
select * from c_emp_30; -- empno, ename, job, sal ���ϴ� �ʵ常 ����

-- UNION -- pk / fk �ƴ� ���� ���̺� ��ġ�� -----------------------------------
SELECT * FROM emp
    UNION -- �ߺ� ���ڵ� �����ϰ� ���ļ� ������
SELECT * FROM c_emp;

insert into c_emp(empno, ename, deptno) values(303, '����', 40);

SELECT * FROM emp
    UNION All -- �ߺ� ���ڵ� �����ؼ� ���ļ� ������
SELECT * FROM c_emp;

SELECT * FROM emp -- #error# �ʵ� ���� ����� ��.
    UNION
    SELECT * FROM c_emp_30;

SELECT empno, ename, job, sal FROM emp -- �ʵ� ����
    UNION
    SELECT * FROM c_emp_30;
    
desc emp;    

--����4] �����ȣ, �̸�, �޿� �׸��� 15%�λ�� �޿��� ������ ǥ���ϵ�
--    �÷����� New Salary�� �����Ͽ� ����Ͻÿ�.
SELECT empno "�����ȣ", ename "�̸�", sal "�޿�" , round((sal*1.15), 0) "NEW Salary"
    FROM emp;
    
--����5]�� ����� �̸��� ǥ���ϰ�, �ٹ� �� ���� ����Ͽ� �÷����� 
--     Months_Works�� �����ϰ�, �ٹ� �޼��� �������� ������ �������
--     �����Ͽ� ����Ͻÿ�.
SELECT emp.ename "�̸�", hiredate, TRUNC(MONTHS_BETWEEN(TO_DATE(emp.HIREDATE, 'YY-MM-DD'), SYSDATE)) "Months_Works" 
    FROM DUAL, EMP
    ORDER BY "Months_Works" desc ;
    
--����6]����� �̸��� Ŀ�̼��� ����ϵ�, Ŀ�̼��� å������ ���� 
--    ����� Ŀ�̼��� 'no commission'���� ����Ͻÿ�.
SELECT ename "�̸�", decode(comm, null, 'no commission', comm) "Ŀ�̼�" 
    FROM emp;
    
SELECT ename, nvl(CAST(comm as VARCHAR2(20)), 'no commission') "comm" 
    FROM emp;

/* ����>
insert into ���̺��̸�
    select �÷���, ... from ���̺��̸�
*/

SELECT * FROM c_emp3;

INSERT INTO c_emp3
    SELECT * FROM emp;
    
ROLLBACK;
INSERT INTO c_emp3 -- �ʵ� ����, Ÿ�� �¾ƾ� ��
    SELECT empno, ename from emp;
    
CREATE TABLE c_emp5
    AS SELECT empno, hiredate, sal 
    FROM emp
    WHERE 1=0;
    
SELECT * FROM c_emp5;

SELECT * FROM emp2;
INSERT INTO c_emp5 -- �ʵ� ����, Ÿ�� �¾ƾ���
    SELECT empno, birthday, pay -- �ʵ�� Ÿ��ũ����� �´ٸ� �ٸ� ���̺��� ���ڵ嵵 ���� ����
    FROM emp2;
    
    
    
    