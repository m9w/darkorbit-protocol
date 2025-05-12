package com.darkorbit

interface PetLocatorGearInitializationCommand : ProtocolPacket {
	var locatorType: PetGearTypeModule
	var possibleTargetValues: MutableList<Int>
}
