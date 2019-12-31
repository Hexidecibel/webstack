/*
 * This file is generated by jOOQ.
 */
package com.tipgiv.webstack.db.models;


import com.tipgiv.webstack.db.models.tables.FlywaySchemaHistory;
import com.tipgiv.webstack.db.models.tables.TgUser;
import com.tipgiv.webstack.db.models.tables.records.FlywaySchemaHistoryRecord;
import com.tipgiv.webstack.db.models.tables.records.TgUserRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TgUserRecord, Long> IDENTITY_TG_USER = Identities0.IDENTITY_TG_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<TgUserRecord> TG_USER_PKEY = UniqueKeys0.TG_USER_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TgUserRecord, Long> IDENTITY_TG_USER = Internal.createIdentity(TgUser.TG_USER, TgUser.TG_USER.USER_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<TgUserRecord> TG_USER_PKEY = Internal.createUniqueKey(TgUser.TG_USER, "tg_user_pkey", TgUser.TG_USER.USER_ID);
    }
}
