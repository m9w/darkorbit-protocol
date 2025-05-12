package com.darkorbit

interface SkylabViewModuleBackCommand : ProtocolPacket {
	var collectorInfo: SkylabCollectorInfoCommand
	var moduleName: String
	var productivity: SkylabModuleProductivityCommand
	var strorageInfo: SkylabStorageInfoCommand
	var upgrade: SkylabModuleUpgradeCommand
	var xenoInfo: SkylabXenoInfoCommand
}
