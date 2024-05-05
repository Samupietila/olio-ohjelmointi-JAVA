SELECT * FROM currencies;
SELECT currencies.name, currencies.symbol FROM currencies WHERE currencies.code = 'EUR';
SELECT COUNT(*) FROM currencies;
select max(rate) from currencies;
