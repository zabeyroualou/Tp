/*
 * This file is generated by jOOQ.
 */
package models.cegib.compta.matieres.tables.records;


import models.cegib.compta.matieres.tables.Categories;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoriesRecord extends UpdatableRecordImpl<CategoriesRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.categories.code</code>.
     */
    public CategoriesRecord setCode(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.categories.code</code>.
     */
    public String getCode() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.categories.nom</code>.
     */
    public CategoriesRecord setNom(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.categories.nom</code>.
     */
    public String getNom() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Categories.CATEGORIES.CODE;
    }

    @Override
    public Field<String> field2() {
        return Categories.CATEGORIES.NOM;
    }

    @Override
    public String component1() {
        return getCode();
    }

    @Override
    public String component2() {
        return getNom();
    }

    @Override
    public String value1() {
        return getCode();
    }

    @Override
    public String value2() {
        return getNom();
    }

    @Override
    public CategoriesRecord value1(String value) {
        setCode(value);
        return this;
    }

    @Override
    public CategoriesRecord value2(String value) {
        setNom(value);
        return this;
    }

    @Override
    public CategoriesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CategoriesRecord
     */
    public CategoriesRecord() {
        super(Categories.CATEGORIES);
    }

    /**
     * Create a detached, initialised CategoriesRecord
     */
    public CategoriesRecord(String code, String nom) {
        super(Categories.CATEGORIES);

        setCode(code);
        setNom(nom);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CategoriesRecord
     */
    public CategoriesRecord(models.cegib.compta.matieres.tables.pojos.Categories value) {
        super(Categories.CATEGORIES);

        if (value != null) {
            setCode(value.getCode());
            setNom(value.getNom());
            resetChangedOnNotNull();
        }
    }
}
