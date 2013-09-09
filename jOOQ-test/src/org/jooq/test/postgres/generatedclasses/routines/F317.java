package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F317 extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1430131875;

	/**
	 * The parameter <code>public.f317.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.f317.p1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P1 = createParameter("p1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.f317.p2</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P2 = createParameter("p2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.f317.p3</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P3 = createParameter("p3", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.f317.p4</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P4 = createParameter("p4", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F317() {
		super("f317", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>p1</code> parameter IN value to the routine
	 */
	public void setP1(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.F317.P1, value);
	}

	/**
	 * Set the <code>p1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(org.jooq.Field<java.lang.Integer> field) {
		setField(P1, field);
	}

	/**
	 * Set the <code>p2</code> parameter IN value to the routine
	 */
	public void setP2(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.F317.P2, value);
	}

	/**
	 * Set the <code>p2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP2(org.jooq.Field<java.lang.Integer> field) {
		setField(P2, field);
	}

	/**
	 * Set the <code>p3</code> parameter IN value to the routine
	 */
	public void setP3(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.F317.P3, value);
	}

	/**
	 * Set the <code>p3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP3(org.jooq.Field<java.lang.Integer> field) {
		setField(P3, field);
	}

	/**
	 * Set the <code>p4</code> parameter IN value to the routine
	 */
	public void setP4(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.F317.P4, value);
	}

	/**
	 * Set the <code>p4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP4(org.jooq.Field<java.lang.Integer> field) {
		setField(P4, field);
	}
}
