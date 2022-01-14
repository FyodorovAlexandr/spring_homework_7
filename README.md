Перед запуском необходимо запустить PostgreSQL:
docker run --name account-postgres -p 5433:5432 -e POSTGRES_USER=account -e POSTGRES_PASSWORD=account -e POSTGRES_DB=account -d postgres:14

Добавить авторизацию и аутентификацию в stock-service.

Необходимо совместить аутентификацию с помощью jwt c пользователями из БД. 
Так же добавить авторизацию - проверку на роли 
(Добавить роли BASE и PRO, для BASE - доступен только запрос в реальном времени, 
для PRO и в реальном и исторические запросы).