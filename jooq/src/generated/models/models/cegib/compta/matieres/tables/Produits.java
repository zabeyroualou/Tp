/*
 * This file is generated by jOOQ.
 */
package models.cegib.compta.matieres.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import models.cegib.compta.matieres.Keys;
import models.cegib.compta.matieres.Public;
import models.cegib.compta.matieres.tables.records.ProduitsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Produits extends TableImpl<ProduitsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.produits</code>
     */
    public static final Produits PRODUITS = new Produits();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProduitsRecord> getRecordType() {
        return ProduitsRecord.class;
    }

    /**
     * The column <code>public.produits.id</code>.
     */
    public final TableField<ProduitsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.produits.name</code>.
     */
    public final TableField<ProduitsRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.produits.description</code>.
     */
    public final TableField<ProduitsRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.produits.quantite</code>.
     */
    public final TableField<ProduitsRecord, BigDecimal> QUANTITE = createField(DSL.name("quantite"), SQLDataType.NUMERIC(8, 2).nullable(false), this, "");

    /**
     * The column <code>public.produits.categorie</code>.
     */
    public final TableField<ProduitsRecord, String> CATEGORIE = createField(DSL.name("categorie"), SQLDataType.VARCHAR(255), this, "");

    private Produits(Name alias, Table<ProduitsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Produits(Name alias, Table<ProduitsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.produits</code> table reference
     */
    public Produits(String alias) {
        this(DSL.name(alias), PRODUITS);
    }

    /**
     * Create an aliased <code>public.produits</code> table reference
     */
    public Produits(Name alias) {
        this(alias, PRODUITS);
    }

    /**
     * Create a <code>public.produits</code> table reference
     */
    public Produits() {
        this(DSL.name("produits"), null);
    }

    public <O extends Record> Produits(Table<O> child, ForeignKey<O, ProduitsRecord> key) {
        super(child, key, PRODUITS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ProduitsRecord, Long> getIdentity() {
        return (Identity<ProduitsRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ProduitsRecord> getPrimaryKey() {
        return Keys.PRODUITS_PKEY;
    }

    @Override
    public List<ForeignKey<ProduitsRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PRODUITS__PRODUITS_CATEGORIE_ID_FOREIGN);
    }

    private transient Categories _categories;

    /**
     * Get the implicit join path to the <code>public.categories</code> table.
     */
    public Categories categories() {
        if (_categories == null)
            _categories = new Categories(this, Keys.PRODUITS__PRODUITS_CATEGORIE_ID_FOREIGN);

        return _categories;
    }

    @Override
    public Produits as(String alias) {
        return new Produits(DSL.name(alias), this);
    }

    @Override
    public Produits as(Name alias) {
        return new Produits(alias, this);
    }

    @Override
    public Produits as(Table<?> alias) {
        return new Produits(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Produits rename(String name) {
        return new Produits(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Produits rename(Name name) {
        return new Produits(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Produits rename(Table<?> name) {
        return new Produits(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, BigDecimal, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Long, ? super String, ? super String, ? super BigDecimal, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Long, ? super String, ? super String, ? super BigDecimal, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
