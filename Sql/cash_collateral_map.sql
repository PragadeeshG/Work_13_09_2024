create table if not exists cash_collateral_map(
cash_collateral_id Integer not null,
mapping_cash_collateral1 varchar(255) null,
mapping_value1 varchar(255) null,
mapping_cash_collateral2 varchar(255) null,
mapping_value2 varchar(255) null,
mapping_cash_collateral3 varchar(255) null,
mapping_value3 varchar(255) null,
mapping_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint cash_collateral_map_pk primary key(cash_collateral_id));