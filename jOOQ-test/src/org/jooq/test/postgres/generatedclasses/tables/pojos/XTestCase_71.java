package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_71 implements org.jooq.test.postgres.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = 841994468;

	private final java.lang.Integer id;
	private final java.lang.Short   testCase_64_69Id;

	public XTestCase_71(
		java.lang.Integer id,
		java.lang.Short   testCase_64_69Id
	) {
		this.id = id;
		this.testCase_64_69Id = testCase_64_69Id;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return this.testCase_64_69Id;
	}
}
