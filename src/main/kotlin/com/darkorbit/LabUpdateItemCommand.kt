package com.darkorbit

interface LabUpdateItemCommand : ProtocolPacket {
	var itemsUpdatedInfo: MutableList<UpdateItemModule>
}
