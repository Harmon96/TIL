-- Sub Query --------------
-- ex) SELECT * FROM emp WHERE ename = (������������);
SELECT * FROM emp2;
SELECT * FROM emp2 WHERE name='�����';
SELECT * FROM emp2 WHERE pay > 60000000;
SELECT * FROM emp2 WHERE pay > ( SELECT pay FROM emp2 WHERE name='�����');

--����1] emp2 ��� �޿����� ���� �������� ����ϼ���.
SELECT * 
    FROM EMP2 
    WHERE pay < ( SELECT avg(pay) FROM emp2);

--����2] �л� ���̺��� 1�г�(grade) ��� Ű���� ū ����� ����ϼ���
SELECT * 
    FROM student 
    WHERE height > ( SELECT avg(height) FROM student WHERE grade=1);

--����3] �л� ���̺�, �а� ���̺��� ����Ͽ� ������ �л��� ����(deptno1)��
--    ������ �л����� �̸��� �а� �̸��� ����ϼ���
SELECT name "�̸�", dname "�а��̸�"
    FROM student LEFT JOIN department
    ON deptno1 = deptno
    WHERE deptno1 = ( SELECT deptno1 FROM student WHERE name='������');


--����4] ���� ���̺��� �Ի����� �۵��� �������� ���߿� �Ի��� ����� �̸�, �Ի���, �а����� ����Ͻÿ�
SELECT NAME "�̸�", hiredate "�Ի���", dname "�а���"
    FROM professor LEFT JOIN department
    ON professor.deptno = department.deptno
    WHERE hiredate > ( SELECT hiredate FROM professor WHERE NAME='�۵���');


--����5] �л� ���̺��� ������ 101�� �а��� ��� �����Ժ��� �����԰� ���� �л����� �̸��� �����Ը� ����ϼ���.
SELECT NAME "�̸�", WEIGHT "������"
    FROM student
    WHERE weight > (SELECT AVG(weight) FROM student WHERE deptno1 = 101);
    
-- ���������� ����� �� �� �̻� ��ȯ�ɶ��� in, any, all �����ڸ� �����.
SELECT empno, name, deptno
    from emp2
    where deptno in (1000, 1001, 1002, 1010, 2000, 2001);
    
SELECT dcode FROM dept2 WHERE area='��������';

SELECT empno, name, deptno
    FROM emp2
    WHERE deptno in(select dcode from dept2 where area='��������');
    
--1. EMP2 ���̺��� ����Ͽ� ��ü ���� �� ���� ������ �ּ� �����ں��� ������ 
--    ���� ����� �̸��� ����,������ ����ϼ���. 
--    �� ���� ��� ������ �Ʒ��� ���� õ ���� ���б�ȣ�� �� ǥ�ø� �ϼ���
SELECT * FROM EMP2;
SELECT name "�̸�", position "����", TO_CHAR(pay, 'L999,999,999')"����" 
    FROM emp2
    WHERE pay > ( SELECT min(pay) FROM emp2 WHERE position='����');

--2. student ���̺��� ��ȸ�Ͽ� ��ü �л� �߿��� ü���� 4�г� �л����� ü�߿��� ���� ���� ������ �л����� ���� �л��� �̸��� �г�� �����Ը� ���.
SELECT * FROM student;
SELECT name "�̸�", grade "�г�", weight "������"
    FROM student
    WHERE height < ( SELECT min(height) FROM student WHERE grade=4);

--3. student ���̺��� ��ȸ�Ͽ� �� �г⺰�� �ִ� Ű�� ���� �л����� �г�� �̸��� Ű�� ���.
SELECT grade "�г�", name "�̸�", height "Ű"
    FROM student
    WHERE (grade, height) in ( SELECT grade, max(height) FROM student group by grade);

--4. professor ���̺��� ��ȸ�Ͽ� �� �а����� �Ի����� ���� ������ ������ ������ȣ�� �̸�, �Ի���, �а����� ���. 
--    ��, �а�������� �������� ����.    

