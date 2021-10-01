-- View --------------------------------------
/*
CREATE or REPLACE VIEW ���̸�
    AS SELECT ~
*/

CREATE OR REPLACE VIEW v_emp
    AS SELECT empno, ename, deptno FROM emp;

SELECT * FROM v_emp;    

-- emp ���̺� �����ϸ� v_emp ? O
-- v_emp ���̺� �����ϸ� emp ? X

CREATE VIEW v_emp_30
    AS SELECT job, ename, sal FROM emp WHERE deptno=30;

SELECT * FROM v_emp_30;

--����1] 30�� �μ� ������� ����, �̸�, ������ ���� view  ���̺� �����, ��Ī ����, ����̸�, �޿��� Alias �ְ�
--    ������ 2000���� ���� ����鸸 �����ؼ� �� �����
CREATE VIEW v_emp_quiz1
    AS SELECT job "����", ename "����̸�", sal "�޿�" FROM emp WHERE deptno=30 and sal>2000;
SELECT * FROM v_emp_quiz1;    

--����2] �μ���(�κ���==�Ұ�) �ִ�޿�, �ּұ޿�, ��ձ޿��� ���� �� �����
CREATE VIEW v_emp_quiz2
    AS SELECT deptno, max(sal) �ִ�޿�, min(sal) �ּұ޿�, round(avg(sal), 2) ��ձ޿�
    FROM emp
    GROUP BY deptno;
    
--����3] �μ��� ��ձ޿��� ���� �並 ����µ�, ��� �޿��� 2000�̻��� �μ��� ����ϼ���.
CREATE VIEW v_emp_quiz3
    AS SELECT deptno "�μ���ȣ", round(avg(sal), 2) "��ձ޿�"
    FROM emp
    GROUP BY deptno HAVING avg(SAL)>2000;

--����4] ������ �ѱ޿��� ���� �� ���̺� �����, ����(job)�� manager�� ������� �����ϰ� �ѱ޿��� 3000�̻��� ����� ����ϱ�
create view v_emp_quiz4
    AS SELECT job, sal "�ѱ޿�"
    FROM (SELECT job, sum(sal) sal FROM emp WHERE job != 'MANAGER' AND sal >= 3000 GROUP BY job);

-- SQL ���Ǿ� ����� ��ҹ��� ���� ���Ѵ�. ���ڵ忡 ���� ���� ��ҹ��� ������. (����Ŭ)

-- rownum / rowid ---------------------------
SELECT ROWNUM, ename, sal FROM emp;
SELECT ROWNUM, ename, sal FROM emp where rownum = 1;
SELECT ROWNUM, ename, sal FROM emp where rownum = 1;

SELECT ROWNUM, ename, rowid FROM emp; -- �Խ��ǿ� ����¡ ó���Ҷ� ���  rownum cf) mysql - limit


-- sequence -------------
create sequence �������̸� -- 1���� ����
    [start with ���۰�]
    [increment by ����ġ]
    [maxvalue �ִ밪]
    [minvalue �ּҰ�]
    [cycle | nocycle ]
    [cache | nocycle ];
    
DROP SEQUENCE autonum;    
CREATE SEQUENCE autonum; -- 1���� �����ؼ� 1�� �����Ѵ�

SELECT autonum.nextval FROM dual;
SELECT autonum.currval FROM dual;

CREATE TABLE kosa_tab (NO NUMBER, NAME VARCHAR2(10) );
DELETE kosa_tab;

INSERT INTO kosa_tab VALUES(autonum.nextval, 'aa');
INSERT INTO kosa_tab VALUES(autonum.nextval, 'bb');
INSERT INTO kosa_tab VALUES(autonum.nextval, 'bccc');
INSERT INTO kosa_tab VALUES(autonum.nextval, 'dd');

SELECT * FROM kosa_tab;

DROP SEQUENCE seq_board;
CREATE SEQUENCE seq_board
    START WITH 10
    INCREMENT BY 10
    MINVALUE 2
    MAXVALUE 50
    CYCLE
    NOCACHE;

CREATE TABLE kosa_tab2 (NO NUMBER, NAME VARCHAR2(10));
DELETE kosa_tab2;
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'aa');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'bb');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'bccc');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'dd');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'pppp');
INSERT INTO kosa_tab2 VALUES(seq_board.nextval, 'kkk');

SELECT * FROM kosa_tab2;

-- ����1] �ڵ����� ���������� seq_test ��� �����ϰ� 
-- 100���� �����ؼ� 100�� �����ϴ� ���� �����,
-- ���̺� seq_test ���̺�(num, name, phone) �����.
-- ���ڵ� 3�� �߰��ؼ� Ȯ���ϱ�
CREATE SEQUENCE seq_test
    START WITH 100
    INCREMENT BY 100    
    MINVALUE 100
    MAXVALUE 5000
    CYCLE
    NOCACHE;
    
CREATE TABLE kosa_quiz (num NUMBER, name VARCHAR2(10), phone NUMBER);
INSERT INTO kosa_quiz VALUES(seq_test.nextval, 'ȫ�浿', 0000000000);
INSERT INTO kosa_quiz VALUES(seq_test.nextval, 'ȫ�漭', 0000000001);
INSERT INTO kosa_quiz VALUES(seq_test.nextval, 'ȫ�泲', 0000000002);

SELECT * FROM kosa_quiz;


