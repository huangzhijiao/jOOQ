/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITExoticTypes extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_EXOTIC_TYPES.ID</code>.
	 */
	public ITExoticTypes setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_EXOTIC_TYPES.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_EXOTIC_TYPES.UU</code>.
	 */
	public ITExoticTypes setUu(java.util.UUID value);

	/**
	 * Getter for <code>PUBLIC.T_EXOTIC_TYPES.UU</code>.
	 */
	public java.util.UUID getUu();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITExoticTypes
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITExoticTypes from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITExoticTypes
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITExoticTypes> E into(E into);
}
