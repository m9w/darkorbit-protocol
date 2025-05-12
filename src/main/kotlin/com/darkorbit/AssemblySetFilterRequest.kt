package com.darkorbit

interface AssemblySetFilterRequest : ProtocolPacket {
	var assemblyWindowSettingsModule: AssemblyWindowSettingsModule
	var filterType: AssemblySetFilterRequestFilterType
}
