/**
 * This class is generated by jOOQ
 */
package com.gemtastic.carshop.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CarRecord extends org.jooq.impl.UpdatableRecordImpl<com.gemtastic.carshop.tables.records.CarRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer> {

	private static final long serialVersionUID = -1250302230;

	/**
	 * Setter for <code>public.car.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.car.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.car.license_plate</code>.
	 */
	public void setLicensePlate(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.car.license_plate</code>.
	 */
	public java.lang.String getLicensePlate() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.car.odometer</code>.
	 */
	public void setOdometer(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.car.odometer</code>.
	 */
	public java.lang.Long getOdometer() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>public.car.car_model</code>.
	 */
	public void setCarModel(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.car.car_model</code>.
	 */
	public java.lang.Integer getCarModel() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.gemtastic.carshop.tables.Car.CAR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.gemtastic.carshop.tables.Car.CAR.LICENSE_PLATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return com.gemtastic.carshop.tables.Car.CAR.ODOMETER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return com.gemtastic.carshop.tables.Car.CAR.CAR_MODEL;
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
	public java.lang.String value2() {
		return getLicensePlate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getOdometer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCarModel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CarRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CarRecord value2(java.lang.String value) {
		setLicensePlate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CarRecord value3(java.lang.Long value) {
		setOdometer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CarRecord value4(java.lang.Integer value) {
		setCarModel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CarRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Long value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CarRecord
	 */
	public CarRecord() {
		super(com.gemtastic.carshop.tables.Car.CAR);
	}

	/**
	 * Create a detached, initialised CarRecord
	 */
	public CarRecord(java.lang.Integer id, java.lang.String licensePlate, java.lang.Long odometer, java.lang.Integer carModel) {
		super(com.gemtastic.carshop.tables.Car.CAR);

		setValue(0, id);
		setValue(1, licensePlate);
		setValue(2, odometer);
		setValue(3, carModel);
	}
}
