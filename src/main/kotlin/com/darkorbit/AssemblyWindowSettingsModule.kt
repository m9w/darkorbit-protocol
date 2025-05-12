package com.darkorbit

interface AssemblyWindowSettingsModule : ProtocolPacket {
	var assemblyItemFilters: MutableList<String>
	var filterType: AssemblyWindowSettingsModuleFilterType
}
