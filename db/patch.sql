DROP TABLE IF EXISTS public.categories;
CREATE TABLE public.categories (
    code character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nom character varying(225) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT categories_pkey PRIMARY KEY (code)
);


DROP TABLE IF EXISTS public.produits;
CREATE TABLE IF NOT EXISTS public.produits
(
    id bigSerial NOT NULL,
    name character varying(255) COLLATE pg_catalog."default",
    description character varying(255) COLLATE pg_catalog."default",
    quantite numeric(8,2) NOT NULL,
    categorie character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT produits_pkey PRIMARY KEY (id),
    CONSTRAINT produits_categorie_id_foreign FOREIGN KEY (categorie)
        REFERENCES public.categories (code)
);

DROP TABLE IF EXISTS public.commandes;
CREATE TABLE IF NOT EXISTS public.commandes
(
    id bigSerial NOT NULL,
    commande character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT commande_pkey PRIMARY KEY (id)
);

DROP TABLE IF EXISTS public.users;
CREATE TABLE IF NOT EXISTS public.users
(
    id bigSerial NOT NULL,
    name character varying(250) COLLATE pg_catalog."default",
    password character varying(250) COLLATE pg_catalog."default",
    role character varying(250) COLLATE pg_catalog."default",
    CONSTRAINT utilisateurs_pkey PRIMARY KEY (id)
);
