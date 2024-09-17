/*
 * This file is generated by jOOQ.
 */
package models.cegib.compta.matieres.tables.records;


import models.cegib.compta.matieres.tables.Commandes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommandesRecord extends UpdatableRecordImpl<CommandesRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.commandes.id</code>.
     */
    public CommandesRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.commandes.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.commandes.commande</code>.
     */
    public CommandesRecord setCommande(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.commandes.commande</code>.
     */
    public String getCommande() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Commandes.COMMANDES.ID;
    }

    @Override
    public Field<String> field2() {
        return Commandes.COMMANDES.COMMANDE;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCommande();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCommande();
    }

    @Override
    public CommandesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CommandesRecord value2(String value) {
        setCommande(value);
        return this;
    }

    @Override
    public CommandesRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CommandesRecord
     */
    public CommandesRecord() {
        super(Commandes.COMMANDES);
    }

    /**
     * Create a detached, initialised CommandesRecord
     */
    public CommandesRecord(Long id, String commande) {
        super(Commandes.COMMANDES);

        setId(id);
        setCommande(commande);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CommandesRecord
     */
    public CommandesRecord(models.cegib.compta.matieres.tables.pojos.Commandes value) {
        super(Commandes.COMMANDES);

        if (value != null) {
            setId(value.getId());
            setCommande(value.getCommande());
            resetChangedOnNotNull();
        }
    }
}