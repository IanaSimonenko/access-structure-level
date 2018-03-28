# access-structure-level
Общая структура доступа:
1. Пять департаментов: Accounting, Sales, IT, Marketing, HR.
2. Соответственно, пять основных физических отделов (помещений).
3. Каждое помещение имеет 2 уровня доступа: NAME_OF_DEPARTMENT_HEAD_ROOM and NAME_OF_DEPARTMENT_OPENSPACE.
4. Уровень NAME_OF_DEPARTMENT_OPENSPACE доступен всем сотрудникам соответствующего департамента (осуществляется по login/password).
5. Уровень NAME_OF_DEPARTMENT_HEAD_ROOM доступен только руководителю соответствующего департамента (осуществляется по login/password).

Стек реализации: Java+PostgresQL+JDBC+Maven
