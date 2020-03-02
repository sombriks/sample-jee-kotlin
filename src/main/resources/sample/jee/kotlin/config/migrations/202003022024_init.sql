
CREATE TABLE public.changelog (
      id int8 NOT NULL,
      applied_at varchar(25) NOT NULL,
      description varchar(255) NOT NULL,
      CONSTRAINT changelog_pkey PRIMARY KEY (id)
);

