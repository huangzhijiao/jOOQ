package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITIdentityPk {

	private static final long serialVersionUID = -33057344;

	/**
	 * Setter for <code>public.t_identity_pk.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.t_identity_pk.id</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_identity_pk.val</code>. 
	 */
	public void setVal(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.t_identity_pk.val</code>. 
	 */
	@Override
	public java.lang.Integer getVal() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.VAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getVal();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}

	/**
	 * Create a detached, initialised TIdentityPkRecord
	 */
	public TIdentityPkRecord(java.lang.Integer id, java.lang.Integer val) {
		super(org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);

		setValue(0, id);
		setValue(1, val);
	}
}
