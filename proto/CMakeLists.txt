if (NOT TARGET protobuf::libprotobuf)
    find_package(Protobuf REQUIRED)
endif ()

file(GLOB proto_files *.proto)
add_library(proto OBJECT ${proto_files})
target_link_libraries(proto PUBLIC protobuf::libprotobuf)

set(PROTO_BINARY_DIR "${CMAKE_CURRENT_BINARY_DIR}/generated_protos")
target_include_directories(proto INTERFACE "${CMAKE_CURRENT_BINARY_DIR}")

protobuf_generate(TARGET proto IMPORT_DIRS ${CMAKE_CURRENT_LIST_DIR} PROTOC_OUT_DIR "${PROTO_BINARY_DIR}")
