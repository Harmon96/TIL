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















