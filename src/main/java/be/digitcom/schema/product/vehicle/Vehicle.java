/**
 * @url http://schema.org/Vehicle
 * 
 * A vehicle is a device that is designed or used to transport people or cargo over land, water, air, or through space.
 */
package be.digitcom.schema.product.vehicle;

import java.time.LocalDate;
import java.time.LocalTime;

import be.digitcom.schema.product.Product;

/**
 * @author Rufin M�togb� Hounkpe
 *
 */
public class Vehicle extends Product {
	/*
	 * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.
	 * 
	 * Typical unit code(s): SEC for seconds
	 * 
	 * Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. 
	 * Simply use "SEC" for seconds and indicate the velocities in the name of the QuantitativeValue, 
	 * or use valueReference with a QuantitativeValue of 0..60 mph or 0..100 km/h to specify the reference speeds.
	 */
	private LocalTime accelerationTime;
	
	/*
	 * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
	 */
	private String bodyType;
	
	/*
	 * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.
	 * 
	 * Typical unit code(s): LTR for liters, FTQ for cubic foot/feet
	 * 
	 * Note: You can use minValue and maxValue to indicate ranges.
	 */
	private double cargoVolume;
	
	
	/*
	 * The date of the first registration of the vehicle with the respective public authorities.
	 */
	private LocalDate dateVehicleFirstRegistered;
	
	/*
	 * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
	 */
	private String driveWheelConfiguration;
	
	/*
	 * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put "g/km" into the unitText property of that value, 
	 * since there is no UN/CEFACT Common Code for "g/km".
	 */
	private double emissionsCO2;
	
	
	/*
	 * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, 
	 * this should indicate the total of all storage of the same type.
	 * 
	 * Typical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
	 */
	private double fuelCapacity;
	
	
	/*
	 * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).
	 * 
	 * Note 1: There are unfortunately no standard unit codes for liters per 100 km. Use unitText to indicate the unit of measurement, e.g. L/100 km.
	 * 
	 * Note 2: There are two ways of indicating the fuel consumption, fuelConsumption (e.g. 8 liters per 100 km) and fuelEfficiency (e.g. 30 miles per gallon). They are reciprocal.
	 * 
	 * Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use valueReference to link the value for the fuel consumption to another value.
	 */
	private double fuelConsumption;
	
	/*
	 * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).
	 * 
	 * Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use unitText to indicate the unit of measurement, e.g. mpg or km/L.
	 * 
	 * Note 2: There are two ways of indicating the fuel consumption, fuelConsumption (e.g. 8 liters per 100 km) and fuelEfficiency (e.g. 30 miles per gallon). They are reciprocal.
	 * 
	 * Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use valueReference to link the value for the fuel economy to another value.
	 */
	private double fuelEfficiency;
	
	/*
	 * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
	 */
	private String fuelType;
	
	/*
	 * A textual description of known damages, both repaired and unrepaired.
	 */
	private String knownVehicleDamages;
	
	/*
	 * Indicates that the vehicle meets the respective emission standard.
	 */
	private String meetsEmissionStandard;
	
	/*
	 * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.
	 * 
	 * Typical unit code(s): KMT for kilometers, SMI for statute miles
	 */
	private double mileageFromOdometer;
	
	/*
	 * The release date of a vehicle model (often used to differentiate versions of the same make and model).
	 */
	private LocalDate modelDate;
	
	/*
	 * The number or type of airbags in the vehicle.
	 */
	private int numberOfAirbags;
	
	/*
	 * The number of axles.
	 */
	private int numberOfAxles;
	
	/*
	 * The number of doors.
	 */
	private int numberOfDoors;
	
	/*
	 * The total number of forward gears available for the transmission system of the vehicle.
	 */
	private int numberOfForwardGears;
	
	/*
	 * The number of owners of the vehicle, including the current one.
	 */
	private int numberOfPreviousOwners;
	
	/*
	 * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.
	 * 
	 * Typical unit code(s): KGM for kilogram, LBR for pound
	 * 
	 * Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of weight and payload
	 * 
	 * Note 2: You can indicate additional information in the name of the QuantitativeValue node.
	 * 
	 * Note 3: You may also link to a QualitativeValue node that provides additional information using valueReference.
	 * 
	 * Note 4: Note that you can use minValue and maxValue to indicate ranges.
	 */
	private double payload;
	
	/*
	 * The date of production of the item, e.g. vehicle.
	 */
	private LocalDate productionDate;
	
	/*
	 * The date the item e.g. vehicle was purchased by the current owner.
	 */
	private LocalDate purchaseDate;
	
	
	/*
	 * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.
	 */
	private int seatingCapacity;
	
	/*
	 * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range 
	 * (indicated by maxValue should be the maximum speed achievable under regular conditions.
	 * 
	 * Typical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot
	 * 
	 * * Note 1: Use minValue and maxValue to indicate the range. Typically, the minimal value is zero. 
	 * 
	 * * Note 2: There are many different ways of measuring the speed range. 
	 * You can link to information about how the given value has been determined using the valueReference property.
	 */
	private double speed;
	
	/*
	 * The position of the steering wheel or similar device (mostly for cars).
	 */
	private String steeringPosition;
	
	/*
	 * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR)
	 * 
	 * Typical unit code(s): KGM for kilogram, LBR for pound
	 * 
	 * Note 1: You can indicate additional information in the name of the QuantitativeValue node.
	 * 
	 * Note 2: You may also link to a QualitativeValue node that provides additional information using valueReference.
	 * 
	 * Note 3: Note that you can use minValue and maxValue to indicate ranges.
	 */
	private double tongueWeight;
	
	/*
	 * The permitted weight of a trailer attached to the vehicle.
	 * 
	 * Typical unit code(s): KGM for kilogram, LBR for pound 
	 * 
	 * * Note 1: You can indicate additional information in the name of the QuantitativeValue node. 
	 * 
	 * * Note 2: You may also link to a QualitativeValue node that provides additional information using valueReference. 
	 * 
	 * * Note 3: Note that you can use minValue and maxValue to indicate ranges.
	 */
	private double trailerWeight;
	
	/*
	 * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
	 */
	private String vehicleConfiguration;
	
	/*
	 * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
	 */
	private String vehicleIdentificationNumber;
	
	/*
	 * The color or color combination of the interior of the vehicle.
	 */
	private String vehicleInteriorColor;
	
	/*
	 * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). 
	 * While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
	 */
	private String vehicleInteriorType;
	
	/*
	 * The release date of a vehicle model (often used to differentiate versions of the same make and model).
	 */
	private LocalDate vehicleModelDate;
	
	/*
	 * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.
	 * 
	 * Typical unit code(s): C62 for persons.
	 */
	private int vehicleSeatingCapacity;
	
	/*
	 * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. 
	 * The legislation in many countries requires this information to be revealed when offering a car for sale.
	 */
	private String vehicleSpecialUsage;
	
	/*
	 * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
	 */
	private String vehicleTransmission;
	
	/*
	 * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.
	 * 
	 * Typical unit code(s): KGM for kilogram, LBR for pound
	 * 
	 * Note 1: You can indicate additional information in the name of the QuantitativeValue node.
	 * 
	 * Note 2: You may also link to a QualitativeValue node that provides additional information using valueReference.
	 * 
	 * Note 3: Note that you can use minValue and maxValue to indicate ranges.
	 */
	private double weightTotal;
	
	/*
	 * The distance between the centers of the front and rear wheels.
	 * Typical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet
	 */
	private double wheelbase;

	/**
	 * @return the accelerationTime
	 */
	public LocalTime getAccelerationTime() {
		return accelerationTime;
	}

	/**
	 * @param accelerationTime the accelerationTime to set
	 */
	public void setAccelerationTime(LocalTime accelerationTime) {
		this.accelerationTime = accelerationTime;
	}

	/**
	 * @return the bodyType
	 */
	public String getBodyType() {
		return bodyType;
	}

	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	/**
	 * @return the cargoVolume
	 */
	public double getCargoVolume() {
		return cargoVolume;
	}

	/**
	 * @param cargoVolume the cargoVolume to set
	 */
	public void setCargoVolume(double cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	/**
	 * @return the dateVehicleFirstRegistered
	 */
	public LocalDate getDateVehicleFirstRegistered() {
		return dateVehicleFirstRegistered;
	}

	/**
	 * @param dateVehicleFirstRegistered the dateVehicleFirstRegistered to set
	 */
	public void setDateVehicleFirstRegistered(LocalDate dateVehicleFirstRegistered) {
		this.dateVehicleFirstRegistered = dateVehicleFirstRegistered;
	}

	/**
	 * @return the driveWheelConfiguration
	 */
	public String getDriveWheelConfiguration() {
		return driveWheelConfiguration;
	}

	/**
	 * @param driveWheelConfiguration the driveWheelConfiguration to set
	 */
	public void setDriveWheelConfiguration(String driveWheelConfiguration) {
		this.driveWheelConfiguration = driveWheelConfiguration;
	}

	/**
	 * @return the emissionsCO2
	 */
	public double getEmissionsCO2() {
		return emissionsCO2;
	}

	/**
	 * @param emissionsCO2 the emissionsCO2 to set
	 */
	public void setEmissionsCO2(double emissionsCO2) {
		this.emissionsCO2 = emissionsCO2;
	}

	/**
	 * @return the fuelCapacity
	 */
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	/**
	 * @param fuelCapacity the fuelCapacity to set
	 */
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	/**
	 * @return the fuelConsumption
	 */
	public double getFuelConsumption() {
		return fuelConsumption;
	}

	/**
	 * @param fuelConsumption the fuelConsumption to set
	 */
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	/**
	 * @return the fuelEfficiency
	 */
	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	/**
	 * @param fuelEfficiency the fuelEfficiency to set
	 */
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	/**
	 * @return the fuelType
	 */
	public String getFuelType() {
		return fuelType;
	}

	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	/**
	 * @return the knownVehicleDamages
	 */
	public String getKnownVehicleDamages() {
		return knownVehicleDamages;
	}

	/**
	 * @param knownVehicleDamages the knownVehicleDamages to set
	 */
	public void setKnownVehicleDamages(String knownVehicleDamages) {
		this.knownVehicleDamages = knownVehicleDamages;
	}

	/**
	 * @return the meetsEmissionStandard
	 */
	public String getMeetsEmissionStandard() {
		return meetsEmissionStandard;
	}

	/**
	 * @param meetsEmissionStandard the meetsEmissionStandard to set
	 */
	public void setMeetsEmissionStandard(String meetsEmissionStandard) {
		this.meetsEmissionStandard = meetsEmissionStandard;
	}

	/**
	 * @return the mileageFromOdometer
	 */
	public double getMileageFromOdometer() {
		return mileageFromOdometer;
	}

	/**
	 * @param mileageFromOdometer the mileageFromOdometer to set
	 */
	public void setMileageFromOdometer(double mileageFromOdometer) {
		this.mileageFromOdometer = mileageFromOdometer;
	}

	/**
	 * @return the modelDate
	 */
	public LocalDate getModelDate() {
		return modelDate;
	}

	/**
	 * @param modelDate the modelDate to set
	 */
	public void setModelDate(LocalDate modelDate) {
		this.modelDate = modelDate;
	}

	/**
	 * @return the numberOfAirbags
	 */
	public int getNumberOfAirbags() {
		return numberOfAirbags;
	}

	/**
	 * @param numberOfAirbags the numberOfAirbags to set
	 */
	public void setNumberOfAirbags(int numberOfAirbags) {
		this.numberOfAirbags = numberOfAirbags;
	}

	/**
	 * @return the numberOfAxles
	 */
	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	/**
	 * @param numberOfAxles the numberOfAxles to set
	 */
	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	/**
	 * @return the numberOfDoors
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	/**
	 * @param numberOfDoors the numberOfDoors to set
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	/**
	 * @return the numberOfForwardGears
	 */
	public int getNumberOfForwardGears() {
		return numberOfForwardGears;
	}

	/**
	 * @param numberOfForwardGears the numberOfForwardGears to set
	 */
	public void setNumberOfForwardGears(int numberOfForwardGears) {
		this.numberOfForwardGears = numberOfForwardGears;
	}

	/**
	 * @return the numberOfPreviousOwners
	 */
	public int getNumberOfPreviousOwners() {
		return numberOfPreviousOwners;
	}

	/**
	 * @param numberOfPreviousOwners the numberOfPreviousOwners to set
	 */
	public void setNumberOfPreviousOwners(int numberOfPreviousOwners) {
		this.numberOfPreviousOwners = numberOfPreviousOwners;
	}

	/**
	 * @return the payload
	 */
	public double getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(double payload) {
		this.payload = payload;
	}

	/**
	 * @return the productionDate
	 */
	public LocalDate getProductionDate() {
		return productionDate;
	}

	/**
	 * @param productionDate the productionDate to set
	 */
	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

	/**
	 * @return the purchaseDate
	 */
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the seatingCapacity
	 */
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the steeringPosition
	 */
	public String getSteeringPosition() {
		return steeringPosition;
	}

	/**
	 * @param steeringPosition the steeringPosition to set
	 */
	public void setSteeringPosition(String steeringPosition) {
		this.steeringPosition = steeringPosition;
	}

	/**
	 * @return the tongueWeight
	 */
	public double getTongueWeight() {
		return tongueWeight;
	}

	/**
	 * @param tongueWeight the tongueWeight to set
	 */
	public void setTongueWeight(double tongueWeight) {
		this.tongueWeight = tongueWeight;
	}

	/**
	 * @return the trailerWeight
	 */
	public double getTrailerWeight() {
		return trailerWeight;
	}

	/**
	 * @param trailerWeight the trailerWeight to set
	 */
	public void setTrailerWeight(double trailerWeight) {
		this.trailerWeight = trailerWeight;
	}

	/**
	 * @return the vehicleConfiguration
	 */
	public String getVehicleConfiguration() {
		return vehicleConfiguration;
	}

	/**
	 * @param vehicleConfiguration the vehicleConfiguration to set
	 */
	public void setVehicleConfiguration(String vehicleConfiguration) {
		this.vehicleConfiguration = vehicleConfiguration;
	}

	/**
	 * @return the vehicleIdentificationNumber
	 */
	public String getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}

	/**
	 * @param vehicleIdentificationNumber the vehicleIdentificationNumber to set
	 */
	public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	/**
	 * @return the vehicleInteriorColor
	 */
	public String getVehicleInteriorColor() {
		return vehicleInteriorColor;
	}

	/**
	 * @param vehicleInteriorColor the vehicleInteriorColor to set
	 */
	public void setVehicleInteriorColor(String vehicleInteriorColor) {
		this.vehicleInteriorColor = vehicleInteriorColor;
	}

	/**
	 * @return the vehicleInteriorType
	 */
	public String getVehicleInteriorType() {
		return vehicleInteriorType;
	}

	/**
	 * @param vehicleInteriorType the vehicleInteriorType to set
	 */
	public void setVehicleInteriorType(String vehicleInteriorType) {
		this.vehicleInteriorType = vehicleInteriorType;
	}

	/**
	 * @return the vehicleModelDate
	 */
	public LocalDate getVehicleModelDate() {
		return vehicleModelDate;
	}

	/**
	 * @param vehicleModelDate the vehicleModelDate to set
	 */
	public void setVehicleModelDate(LocalDate vehicleModelDate) {
		this.vehicleModelDate = vehicleModelDate;
	}

	/**
	 * @return the vehicleSeatingCapacity
	 */
	public int getVehicleSeatingCapacity() {
		return vehicleSeatingCapacity;
	}

	/**
	 * @param vehicleSeatingCapacity the vehicleSeatingCapacity to set
	 */
	public void setVehicleSeatingCapacity(int vehicleSeatingCapacity) {
		this.vehicleSeatingCapacity = vehicleSeatingCapacity;
	}

	/**
	 * @return the vehicleSpecialUsage
	 */
	public String getVehicleSpecialUsage() {
		return vehicleSpecialUsage;
	}

	/**
	 * @param vehicleSpecialUsage the vehicleSpecialUsage to set
	 */
	public void setVehicleSpecialUsage(String vehicleSpecialUsage) {
		this.vehicleSpecialUsage = vehicleSpecialUsage;
	}

	/**
	 * @return the vehicleTransmission
	 */
	public String getVehicleTransmission() {
		return vehicleTransmission;
	}

	/**
	 * @param vehicleTransmission the vehicleTransmission to set
	 */
	public void setVehicleTransmission(String vehicleTransmission) {
		this.vehicleTransmission = vehicleTransmission;
	}

	/**
	 * @return the weightTotal
	 */
	public double getWeightTotal() {
		return weightTotal;
	}

	/**
	 * @param weightTotal the weightTotal to set
	 */
	public void setWeightTotal(double weightTotal) {
		this.weightTotal = weightTotal;
	}

	/**
	 * @return the wheelbase
	 */
	public double getWheelbase() {
		return wheelbase;
	}

	/**
	 * @param wheelbase the wheelbase to set
	 */
	public void setWheelbase(double wheelbase) {
		this.wheelbase = wheelbase;
	}
	
	
	
}
