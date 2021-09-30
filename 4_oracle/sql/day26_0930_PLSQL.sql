-- PL/SQL
/*
Declare - ���� (����)
Begin
    ����(�ʼ�)
End;
*/

Begin
    DBMS_output.put_line('jaehyeok'); -- ���
End;
------------------------------------------------
DECLARE
    vno number(4);
    vname VARCHAR2(20);
BEGIN
    SELECT empno, name 
            INTO vno, vname
        FROM emp2
        WHERE empno = &empno;  -- ����ó�� �����´�.
        DBMS_OUTPUT.PUT_line('�Է°� : ' || vno || ' <---> ' || vname );
END;
------------------------------------------------
SELECT * from emp2;

CREATE OR REPLACE PROCEDURE p_test(name IN VARCHAR2)
IS
    BEGIN
        DBMS_output.put_line(name || '�� ���� �հ��Դϴ�');
    END;

exec p_test('������');
exec p_test('kingsmile');
------------------------------------------------
SELECT * FROM userlist;
DROP TABLE userlist;

CREATE OR REPLACE PROCEDURE p_userlist(
        id IN userlist.id%TYPE := 'jaehyeok', 
        name IN userlist.name%TYPE DEFAULT '����',
        age IN userlist.age%TYPE := 10,
        addr in userlist.addr%TYPE := null
    )
IS
    BEGIN
        INSERT INTO userlist values(id, name, age, addr);
        DBMS_output.put_line('insert ������ ' || id || name || age || addr);
    END;



--CREATE TABLE userlist(
--    id VARCHAR2(10),
--    name VARCHAR2(20),
--    age NUMBER,
--    addr VARCHAR2(50)
--);

desc emp;    
------------------------------------------------
exec p_userlist('yuna', '������', 20, '����');   -- ��ü �ʵ� �߰�    
exec p_userlist;    -- default data input 
exec p_userlist(id=>'�ں���', age=>50);    -- ���ϴ� �ʵ尪�� �߰� ����
SELECT * FROM userlist;   

BEGIN
    FOR i IN 1..10 LOOP
        INSERT INTO userlist(age) VALUES(i);
    END LOOP;
END;    

------------------------------------------------    
-- ����] PL/SQL ��
SELECT s.name, p.name, d.dname
    FROM professor p JOIN student s
    ON p.deptno = s.deptno1 JOIN department d
    ON d.deptno = s.deptno1
    -- WHERE s.deptno1 = 103;
    WHERE d.dname = '��ǻ�Ͱ��а�';
    