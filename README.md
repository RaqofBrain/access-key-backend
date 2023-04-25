# access-key-backend
=====================
Тестовое задание:

API endpoint для проверки поддержки IPv6 сайтом.

Характеристики этого endpoint'a:
 - публичный
 - /api/web/checkIpv6Support - путь.
 - siteUrl - query parameter. Сюда приходит url сайта который нужно проверить на поддержку IPv6.
 - success - boolean. Такой должен быть ответ, с 200 кодом.

Примечания:
 - siteUrl - принимает как домен в чистом виде, так и полный URI.
