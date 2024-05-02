CREATE TABLE owners (
    owner_id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR NOT NULL
);

CREATE TABLE restaurants(
    restaurant_id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR NOT NULL
);