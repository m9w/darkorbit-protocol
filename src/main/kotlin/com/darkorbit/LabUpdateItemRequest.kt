package com.darkorbit

interface LabUpdateItemRequest : ProtocolPacket {
	var itemToUpdate: LabItemModule
	var updateWith: OreCountModule
}
