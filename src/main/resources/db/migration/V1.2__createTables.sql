CREATE TABLE "vuss" (
	"id" integer NOT NULL,
	"name" varchar(50),
	"adress" varchar(100),
	CONSTRAINT "vuss_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "sotr" (
	"id" integer NOT NULL,
	"idvuss" integer,
	"name" varchar(50),
	"fone" varchar(10),
	CONSTRAINT "sotr_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "spec" (
	"id" integer NOT NULL,
	"idvuss" integer,
	"name" varchar(50),
	"info" varchar(100),
	CONSTRAINT "spec_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);




ALTER TABLE "sotr" ADD CONSTRAINT "sotr_fk0" FOREIGN KEY ("idvuss") REFERENCES "vuss"("id");

ALTER TABLE "spec" ADD CONSTRAINT "spec_fk0" FOREIGN KEY ("idvuss") REFERENCES "vuss"("id");
