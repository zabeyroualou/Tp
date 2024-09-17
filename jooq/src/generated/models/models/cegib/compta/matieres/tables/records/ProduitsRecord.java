/*
 * This file is generated by jOOQ.
 */
package models.cegib.compta.matieres.tables.records;


import java.math.BigDecimal;

import models.cegib.compta.matieres.tables.Produits;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProduitsRecord extends UpdatableRecordImpl<ProduitsRecord> implements Record5<Long, String, String, BigDecimal, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.produits.id</code>.
     */
    public ProduitsRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.produits.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.produits.name</code>.
     */
    public ProduitsRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.produits.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.produits.description</code>.
     */
    public ProduitsRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.produits.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.produits.quantite</code>.
     */
    public ProduitsRecord setQuantite(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.produits.quantite</code>.
     */
    public BigDecimal getQuantite() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.produits.categorie</code>.
     */
    public ProduitsRecord setCategorie(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.produits.categorie</code>.
     */
    public String getCategorie() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, String, BigDecimal, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, String, BigDecimal, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Produits.PRODUITS.ID;
    }

    @Override
    public Field<String> field2() {
        return Produits.PRODUITS.NAME;
    }

    @Override
    public Field<String> field3() {
        return Produits.PRODUITS.DESCRIPTION;
    }

    @Override
    public Field<BigDecimal> field4() {
        return Produits.PRODUITS.QUANTITE;
    }

    @Override
    public Field<String> field5() {
        return Produits.PRODUITS.CATEGORIE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public BigDecimal component4() {
        return getQuantite();
    }

    @Override
    public String component5() {
        return getCategorie();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public BigDecimal value4() {
        return getQuantite();
    }

    @Override
    public String value5() {
        return getCategorie();
    }

    @Override
    public ProduitsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ProduitsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ProduitsRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ProduitsRecord value4(BigDecimal value) {
        setQuantite(value);
        return this;
    }

    @Override
    public ProduitsRecord value5(String value) {
        setCategorie(value);
        return this;
    }

    @Override
    public ProduitsRecord values(Long value1, String value2, String value3, BigDecimal value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProduitsRecord
     */
    public ProduitsRecord() {
        super(Produits.PRODUITS);
    }

    /**
     * Create a detached, initialised ProduitsRecord
     */
    public ProduitsRecord(Long id, String name, String description, BigDecimal quantite, String categorie) {
        super(Produits.PRODUITS);

        setId(id);
        setName(name);
        setDescription(description);
        setQuantite(quantite);
        setCategorie(categorie);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ProduitsRecord
     */
    public ProduitsRecord(models.cegib.compta.matieres.tables.pojos.Produits value) {
        super(Produits.PRODUITS);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setDescription(value.getDescription());
            setQuantite(value.getQuantite());
            setCategorie(value.getCategorie());
            resetChangedOnNotNull();
        }
    }
}
