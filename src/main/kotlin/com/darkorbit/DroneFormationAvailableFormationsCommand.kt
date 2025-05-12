package com.darkorbit

interface DroneFormationAvailableFormationsCommand : ProtocolPacket {
	var availableFormations: MutableList<Int>
}
