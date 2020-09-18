
    create table Casas (
        id bigint not null auto_increment,
        anioFundacion integer not null,
        nombre varchar(255),
        patrimonio integer not null,
        lugarOrigen_id bigint,
        vasallaDe_id bigint,
        primary key (id)
    )

    create table Castillos (
        cantidadMurallas integer not null,
        cantidadTorres integer not null,
        id bigint not null,
        primary key (id)
    )

    create table Ciudades (
        cantidadDeComercios integer not null,
        cantidadDeSantuarios integer not null,
        tasaDeMortalidad double precision not null,
        id bigint not null,
        primary key (id)
    )

    create table Fuerzas_Militares (
        tipo varchar(31) not null,
        id bigint not null auto_increment,
        cantidadBarcos integer,
        cantidadSoldados integer,
        cantidadDragones integer,
        casa_id bigint,
        primary key (id)
    )

    create table Lugares (
        id bigint not null auto_increment,
        anioFundacion integer not null,
        nombre varchar(255),
        poblacion integer not null,
        primary key (id)
    )

    create table Regiones (
        id bigint not null auto_increment,
        nombre varchar(255),
        casaPrincipal_id bigint,
        primary key (id)
    )

    create table Regiones_Lugares (
        Regiones_id bigint not null,
        lugares_id bigint not null
    )

    alter table Casas 
        add constraint FK_48vgmbtyp1htrk1u7xvm1pxjl 
        foreign key (lugarOrigen_id) 
        references Lugares (id)

    alter table Casas 
        add constraint FK_j9137y042lbyj5iuxh91ot9wp 
        foreign key (vasallaDe_id) 
        references Casas (id)

    alter table Castillos 
        add constraint FK_lcjlcfggmrywbef9j4rh4ugt8 
        foreign key (id) 
        references Lugares (id)

    alter table Ciudades 
        add constraint FK_4f5ffmqdk8hsh7ss8tppfmrfm 
        foreign key (id) 
        references Lugares (id)

    alter table Fuerzas_Militares 
        add constraint FK_sw1qsogpr6hsoiby200mq40le 
        foreign key (casa_id) 
        references Casas (id)

    alter table Regiones 
        add constraint FK_s0p5up0i6sca213khpg50f9a9 
        foreign key (casaPrincipal_id) 
        references Casas (id)

    alter table Regiones_Lugares 
        add constraint FK_kxe3unaqw12j16wxkbq122ryy 
        foreign key (lugares_id) 
        references Lugares (id)

    alter table Regiones_Lugares 
        add constraint FK_qgpr0gtvwc2fikhakxsbb0ypm 
        foreign key (Regiones_id) 
        references Regiones (id)
