--����1] empno �����ȣ, �̸�, �޿�, ���� �ʵ常 ���(��Ī�� �ش�) �����̸鼭 �������� ��� �˻�
--����2] �ʵ� ����� ���� ����, ������ ���� �̰ų� �蹮ȣ �� ��� �˻� (emp2)
--����3] �޿��� 500 �̻��̰�, ���ʽ��� 60 �̻� �޴� ������?
--����4] �̸����� '�迵��' ������� �����ּ���.
--����5] �̸����� '��'�� ���� ���� ������� �����ּ���. - ��� : %, �ѱ��� : _
--����6] �̸��� �� ������ ����� �����ּ���.
--����7] id�� s or a ���ڰ� ���� ��� ã��
--����8] ���Ӱ��� ã���ּ���
--����9] �̸��� '���Ѷ�'�� '���ѳ�'�� �����ϼ���
--����10] ��̰� ����� ����鸸 ã�Ƽ� '����'���� ����
--����11] ����� ���� ã�Ƽ� �����ϱ�
--����12] pay(or bonus)�� 50 �̻��� ����� ���
--����13] �������̸鼭 '�����' ã��
--����14] �������̰ų� '������' ã��
--����15] �������̰ų� �达���� ���� ��� ã��
--����16] �达�� �ƴ� �������� ã��
--����17] �������̺��� �������� �̸��� ��ȸ�Ͽ� ���� �κп� '��'�� ���Ե� ����� ����� ����ϼ���

select * from emp2;
select empno "�����ȣ", name "�̸�", pay "�޿�", position ���� from emp2;
--����1] empno �����ȣ, �̸�, �޿�, ���� �ʵ常 ���(��Ī�� �ش�) �����̸鼭 �������� ��� �˻�
select empno "�����ȣ", name "�̸�", pay "�޿�", position ���� 
    from emp2 
    where position='����' and name='������';

--����2] �ʵ� ����� ���� ����, ������ ���� �̰ų� �蹮ȣ �� ��� �˻� (emp2)
select empno "�����ȣ", name "�̸�", pay "�޿�", position "����" from emp2 where position='����' or name='�蹮ȣ';

--����3] �޿��� 500 �̻��̰�, ���ʽ��� 60 �̻� �޴� ������?
select * from professor where pay >= 500 and bonus >= 60;

--����4] �̸����� '�迵��' ������� �����ּ���.
select * from professor where name='�迵��';

--����5] �̸����� '��'�� ���� ���� ������� �����ּ���. - ��� : %, �ѱ��� : _
select * from professor where name like '��%';

--����6] �̸��� �� ������ ����� �����ּ���.
select * from professor where name like '__';

--����7] id�� s or a ���ڰ� ���� ��� ã��
select * from professor where id like '%s%' or id like'%a%';

--����8] ���Ӱ��� ã���ּ���
select * from professor where position='���Ӱ���';

--����9] �̸��� '���Ѷ�'�� '���ѳ�'�� �����ϼ���
update emp2 set name='���ѳ�' where name='���Ѷ�';
select * from emp2;

--����10] ��̰� ����� ����鸸 ã�Ƽ� '����'���� ����
update emp2 set hobby='����' where hobby='���';

--����11] ����� ���� ã�Ƽ� �����ϱ�
delete emp2 where emp_type='�����';

--����12] pay(or bonus)�� 50 �̻��� ����� ���
update professor set bonus = nvl(bonus, 0);
select * from professor where bonus >= 50;

--����13] �������̸鼭 '�����' ã��
select * from emp2 where emp_type='������' and name='�����';

--����14] �������̰ų� '������' ã��
select * from emp2 where emp_type='������' or name='������';

--����15] �������̰ų� �达���� ���� ��� ã��
select * from emp2 where emp_type='������' or name like '��%';

--����16] �达�� �ƴ� �������� ã��
select * from emp2 where emp_type='������' and name not like '��%';

--����17] �������̺��� �������� �̸��� ��ȸ�Ͽ� ���� �κп� '��'�� ���Ե� ����� ����� ����ϼ���
select * from professor where name between '��%' and '¥%';
-- select * from professor where name between '��%' and '��%';
select * 
    from professor
    where name >= '��%' AND NAME < '¥%';


