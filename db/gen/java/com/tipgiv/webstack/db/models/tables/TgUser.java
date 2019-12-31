/*
 * This file is generated by jOOQ.
 */
package com.tipgiv.webstack.db.models.tables;


import com.tipgiv.webstack.db.models.DefaultSchema;
import com.tipgiv.webstack.db.models.Indexes;
import com.tipgiv.webstack.db.models.Keys;
import com.tipgiv.webstack.db.models.tables.records.TgUserRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TgUser extends TableImpl<TgUserRecord> {

    private static final long serialVersionUID = -2105942815;

    /**
     * The reference instance of <code>tg_user</code>
     */
    public static final TgUser TG_USER = new TgUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TgUserRecord> getRecordType() {
        return TgUserRecord.class;
    }

    /**
     * The column <code>tg_user.user_id</code>.
     */
    public final TableField<TgUserRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tg_user_user_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>tg_user.user_name</code>.
     */
    public final TableField<TgUserRecord, String> USER_NAME = createField(DSL.name("user_name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>tg_user.first_name</code>.
     */
    public final TableField<TgUserRecord, String> FIRST_NAME = createField(DSL.name("first_name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>tg_user.middle_name</code>.
     */
    public final TableField<TgUserRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>tg_user.last_name</code>.
     */
    public final TableField<TgUserRecord, String> LAST_NAME = createField(DSL.name("last_name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>tg_user.password_hash</code>.
     */
    public final TableField<TgUserRecord, String> PASSWORD_HASH = createField(DSL.name("password_hash"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>tg_user.added_at</code>.
     */
    public final TableField<TgUserRecord, OffsetDateTime> ADDED_AT = createField(DSL.name("added_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>tg_user.modified_at</code>.
     */
    public final TableField<TgUserRecord, OffsetDateTime> MODIFIED_AT = createField(DSL.name("modified_at"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * Create a <code>tg_user</code> table reference
     */
    public TgUser() {
        this(DSL.name("tg_user"), null);
    }

    /**
     * Create an aliased <code>tg_user</code> table reference
     */
    public TgUser(String alias) {
        this(DSL.name(alias), TG_USER);
    }

    /**
     * Create an aliased <code>tg_user</code> table reference
     */
    public TgUser(Name alias) {
        this(alias, TG_USER);
    }

    private TgUser(Name alias, Table<TgUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TgUser(Name alias, Table<TgUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TgUser(Table<O> child, ForeignKey<O, TgUserRecord> key) {
        super(child, key, TG_USER);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TG_USER_PKEY);
    }

    @Override
    public Identity<TgUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_TG_USER;
    }

    @Override
    public UniqueKey<TgUserRecord> getPrimaryKey() {
        return Keys.TG_USER_PKEY;
    }

    @Override
    public List<UniqueKey<TgUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TgUserRecord>>asList(Keys.TG_USER_PKEY);
    }

    @Override
    public TgUser as(String alias) {
        return new TgUser(DSL.name(alias), this);
    }

    @Override
    public TgUser as(Name alias) {
        return new TgUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TgUser rename(String name) {
        return new TgUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TgUser rename(Name name) {
        return new TgUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, String, String, String, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
