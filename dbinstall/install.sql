create database calculation;

create or replace function f_calc(first double precision, second double precision, oper character varying) returns numeric
language plpgsql
as
$$
declare
result numeric;
begin
if oper = '+' then
result := first + second;
elseif oper = '-' then
result := first - second;
elseif oper = '*' then
result := first * second;
elseif oper = '/' then
result := first / second;
end if;
return result;
end;
$$;
