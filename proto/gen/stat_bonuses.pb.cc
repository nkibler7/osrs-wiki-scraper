// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stat_bonuses.proto

#include "stat_bonuses.pb.h"

#include <algorithm>
#include "google/protobuf/io/coded_stream.h"
#include "google/protobuf/extension_set.h"
#include "google/protobuf/wire_format_lite.h"
#include "google/protobuf/descriptor.h"
#include "google/protobuf/generated_message_reflection.h"
#include "google/protobuf/reflection_ops.h"
#include "google/protobuf/wire_format.h"
#include "google/protobuf/generated_message_tctable_impl.h"
// @@protoc_insertion_point(includes)

// Must be included last.
#include "google/protobuf/port_def.inc"
PROTOBUF_PRAGMA_INIT_SEG
namespace _pb = ::google::protobuf;
namespace _pbi = ::google::protobuf::internal;
namespace _fl = ::google::protobuf::internal::field_layout;
namespace github {
namespace nkibler7 {
namespace osrswikiscraper {

inline constexpr StatBonuses::Impl_::Impl_(
    ::_pbi::ConstantInitialized) noexcept
      : stab_attack_{0},
        slash_attack_{0},
        crush_attack_{0},
        ranged_attack_{0},
        magic_attack_{0},
        stab_defence_{0},
        slash_defence_{0},
        crush_defence_{0},
        ranged_defence_{0},
        magic_defence_{0},
        melee_strength_{0},
        ranged_strength_{0},
        magic_damage_{0},
        prayer_{0},
        _cached_size_{0} {}

template <typename>
PROTOBUF_CONSTEXPR StatBonuses::StatBonuses(::_pbi::ConstantInitialized)
    : _impl_(::_pbi::ConstantInitialized()) {}
struct StatBonusesDefaultTypeInternal {
  PROTOBUF_CONSTEXPR StatBonusesDefaultTypeInternal() : _instance(::_pbi::ConstantInitialized{}) {}
  ~StatBonusesDefaultTypeInternal() {}
  union {
    StatBonuses _instance;
  };
};

PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT
    PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 StatBonusesDefaultTypeInternal _StatBonuses_default_instance_;
}  // namespace osrswikiscraper
}  // namespace nkibler7
}  // namespace github
static ::_pb::Metadata file_level_metadata_stat_5fbonuses_2eproto[1];
static constexpr const ::_pb::EnumDescriptor**
    file_level_enum_descriptors_stat_5fbonuses_2eproto = nullptr;
static constexpr const ::_pb::ServiceDescriptor**
    file_level_service_descriptors_stat_5fbonuses_2eproto = nullptr;
const ::uint32_t TableStruct_stat_5fbonuses_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(
    protodesc_cold) = {
    ~0u,  // no _has_bits_
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _internal_metadata_),
    ~0u,  // no _extensions_
    ~0u,  // no _oneof_case_
    ~0u,  // no _weak_field_map_
    ~0u,  // no _inlined_string_donated_
    ~0u,  // no _split_
    ~0u,  // no sizeof(Split)
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.stab_attack_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.slash_attack_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.crush_attack_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.ranged_attack_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.magic_attack_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.stab_defence_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.slash_defence_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.crush_defence_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.ranged_defence_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.magic_defence_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.melee_strength_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.ranged_strength_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.magic_damage_),
    PROTOBUF_FIELD_OFFSET(::github::nkibler7::osrswikiscraper::StatBonuses, _impl_.prayer_),
};

static const ::_pbi::MigrationSchema
    schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
        {0, -1, -1, sizeof(::github::nkibler7::osrswikiscraper::StatBonuses)},
};

static const ::_pb::Message* const file_default_instances[] = {
    &::github::nkibler7::osrswikiscraper::_StatBonuses_default_instance_._instance,
};
const char descriptor_table_protodef_stat_5fbonuses_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
    "\n\022stat_bonuses.proto\022\037github.nkibler7.os"
    "rswikiscraper\"\305\002\n\013StatBonuses\022\023\n\013stab_at"
    "tack\030\001 \001(\005\022\024\n\014slash_attack\030\002 \001(\005\022\024\n\014crus"
    "h_attack\030\003 \001(\005\022\025\n\rranged_attack\030\004 \001(\005\022\024\n"
    "\014magic_attack\030\005 \001(\005\022\024\n\014stab_defence\030\006 \001("
    "\005\022\025\n\rslash_defence\030\007 \001(\005\022\025\n\rcrush_defenc"
    "e\030\010 \001(\005\022\026\n\016ranged_defence\030\t \001(\005\022\025\n\rmagic"
    "_defence\030\n \001(\005\022\026\n\016melee_strength\030\013 \001(\005\022\027"
    "\n\017ranged_strength\030\014 \001(\005\022\024\n\014magic_damage\030"
    "\r \001(\001\022\016\n\006prayer\030\016 \001(\005B\'\n#com.github.nkib"
    "ler7.osrswikiscraperP\001b\006proto3"
};
static ::absl::once_flag descriptor_table_stat_5fbonuses_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_stat_5fbonuses_2eproto = {
    false,
    false,
    430,
    descriptor_table_protodef_stat_5fbonuses_2eproto,
    "stat_bonuses.proto",
    &descriptor_table_stat_5fbonuses_2eproto_once,
    nullptr,
    0,
    1,
    schemas,
    file_default_instances,
    TableStruct_stat_5fbonuses_2eproto::offsets,
    file_level_metadata_stat_5fbonuses_2eproto,
    file_level_enum_descriptors_stat_5fbonuses_2eproto,
    file_level_service_descriptors_stat_5fbonuses_2eproto,
};

// This function exists to be marked as weak.
// It can significantly speed up compilation by breaking up LLVM's SCC
// in the .pb.cc translation units. Large translation units see a
// reduction of more than 35% of walltime for optimized builds. Without
// the weak attribute all the messages in the file, including all the
// vtables and everything they use become part of the same SCC through
// a cycle like:
// GetMetadata -> descriptor table -> default instances ->
//   vtables -> GetMetadata
// By adding a weak function here we break the connection from the
// individual vtables back into the descriptor table.
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_stat_5fbonuses_2eproto_getter() {
  return &descriptor_table_stat_5fbonuses_2eproto;
}
// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2
static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_stat_5fbonuses_2eproto(&descriptor_table_stat_5fbonuses_2eproto);
namespace github {
namespace nkibler7 {
namespace osrswikiscraper {
// ===================================================================

class StatBonuses::_Internal {
 public:
};

StatBonuses::StatBonuses(::google::protobuf::Arena* arena)
    : ::google::protobuf::Message(arena) {
  SharedCtor(arena);
  // @@protoc_insertion_point(arena_constructor:github.nkibler7.osrswikiscraper.StatBonuses)
}
StatBonuses::StatBonuses(
    ::google::protobuf::Arena* arena, const StatBonuses& from)
    : StatBonuses(arena) {
  MergeFrom(from);
}
inline PROTOBUF_NDEBUG_INLINE StatBonuses::Impl_::Impl_(
    ::google::protobuf::internal::InternalVisibility visibility,
    ::google::protobuf::Arena* arena)
      : _cached_size_{0} {}

inline void StatBonuses::SharedCtor(::_pb::Arena* arena) {
  new (&_impl_) Impl_(internal_visibility(), arena);
  ::memset(reinterpret_cast<char *>(&_impl_) +
               offsetof(Impl_, stab_attack_),
           0,
           offsetof(Impl_, prayer_) -
               offsetof(Impl_, stab_attack_) +
               sizeof(Impl_::prayer_));
}
StatBonuses::~StatBonuses() {
  // @@protoc_insertion_point(destructor:github.nkibler7.osrswikiscraper.StatBonuses)
  _internal_metadata_.Delete<::google::protobuf::UnknownFieldSet>();
  SharedDtor();
}
inline void StatBonuses::SharedDtor() {
  ABSL_DCHECK(GetArena() == nullptr);
  _impl_.~Impl_();
}

PROTOBUF_NOINLINE void StatBonuses::Clear() {
// @@protoc_insertion_point(message_clear_start:github.nkibler7.osrswikiscraper.StatBonuses)
  PROTOBUF_TSAN_WRITE(&_impl_._tsan_detect_race);
  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  ::memset(&_impl_.stab_attack_, 0, static_cast<::size_t>(
      reinterpret_cast<char*>(&_impl_.prayer_) -
      reinterpret_cast<char*>(&_impl_.stab_attack_)) + sizeof(_impl_.prayer_));
  _internal_metadata_.Clear<::google::protobuf::UnknownFieldSet>();
}

const char* StatBonuses::_InternalParse(
    const char* ptr, ::_pbi::ParseContext* ctx) {
  ptr = ::_pbi::TcParser::ParseLoop(this, ptr, ctx, &_table_.header);
  return ptr;
}


PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1
const ::_pbi::TcParseTable<4, 14, 0, 0, 2> StatBonuses::_table_ = {
  {
    0,  // no _has_bits_
    0, // no _extensions_
    14, 120,  // max_field_number, fast_idx_mask
    offsetof(decltype(_table_), field_lookup_table),
    4294950912,  // skipmap
    offsetof(decltype(_table_), field_entries),
    14,  // num_field_entries
    0,  // num_aux_entries
    offsetof(decltype(_table_), field_names),  // no aux_entries
    &_StatBonuses_default_instance_._instance,
    ::_pbi::TcParser::GenericFallback,  // fallback
  }, {{
    {::_pbi::TcParser::MiniParse, {}},
    // int32 stab_attack = 1;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.stab_attack_), 63>(),
     {8, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.stab_attack_)}},
    // int32 slash_attack = 2;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.slash_attack_), 63>(),
     {16, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.slash_attack_)}},
    // int32 crush_attack = 3;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.crush_attack_), 63>(),
     {24, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.crush_attack_)}},
    // int32 ranged_attack = 4;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.ranged_attack_), 63>(),
     {32, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.ranged_attack_)}},
    // int32 magic_attack = 5;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.magic_attack_), 63>(),
     {40, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.magic_attack_)}},
    // int32 stab_defence = 6;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.stab_defence_), 63>(),
     {48, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.stab_defence_)}},
    // int32 slash_defence = 7;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.slash_defence_), 63>(),
     {56, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.slash_defence_)}},
    // int32 crush_defence = 8;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.crush_defence_), 63>(),
     {64, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.crush_defence_)}},
    // int32 ranged_defence = 9;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.ranged_defence_), 63>(),
     {72, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.ranged_defence_)}},
    // int32 magic_defence = 10;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.magic_defence_), 63>(),
     {80, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.magic_defence_)}},
    // int32 melee_strength = 11;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.melee_strength_), 63>(),
     {88, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.melee_strength_)}},
    // int32 ranged_strength = 12;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.ranged_strength_), 63>(),
     {96, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.ranged_strength_)}},
    // double magic_damage = 13;
    {::_pbi::TcParser::FastF64S1,
     {105, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.magic_damage_)}},
    // int32 prayer = 14;
    {::_pbi::TcParser::SingularVarintNoZag1<::uint32_t, offsetof(StatBonuses, _impl_.prayer_), 63>(),
     {112, 63, 0, PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.prayer_)}},
    {::_pbi::TcParser::MiniParse, {}},
  }}, {{
    65535, 65535
  }}, {{
    // int32 stab_attack = 1;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.stab_attack_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 slash_attack = 2;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.slash_attack_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 crush_attack = 3;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.crush_attack_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 ranged_attack = 4;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.ranged_attack_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 magic_attack = 5;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.magic_attack_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 stab_defence = 6;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.stab_defence_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 slash_defence = 7;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.slash_defence_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 crush_defence = 8;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.crush_defence_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 ranged_defence = 9;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.ranged_defence_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 magic_defence = 10;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.magic_defence_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 melee_strength = 11;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.melee_strength_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // int32 ranged_strength = 12;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.ranged_strength_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
    // double magic_damage = 13;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.magic_damage_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kDouble)},
    // int32 prayer = 14;
    {PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.prayer_), 0, 0,
    (0 | ::_fl::kFcSingular | ::_fl::kInt32)},
  }},
  // no aux_entries
  {{
  }},
};

::uint8_t* StatBonuses::_InternalSerialize(
    ::uint8_t* target,
    ::google::protobuf::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:github.nkibler7.osrswikiscraper.StatBonuses)
  ::uint32_t cached_has_bits = 0;
  (void)cached_has_bits;

  // int32 stab_attack = 1;
  if (this->_internal_stab_attack() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<1>(
            stream, this->_internal_stab_attack(), target);
  }

  // int32 slash_attack = 2;
  if (this->_internal_slash_attack() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<2>(
            stream, this->_internal_slash_attack(), target);
  }

  // int32 crush_attack = 3;
  if (this->_internal_crush_attack() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<3>(
            stream, this->_internal_crush_attack(), target);
  }

  // int32 ranged_attack = 4;
  if (this->_internal_ranged_attack() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<4>(
            stream, this->_internal_ranged_attack(), target);
  }

  // int32 magic_attack = 5;
  if (this->_internal_magic_attack() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<5>(
            stream, this->_internal_magic_attack(), target);
  }

  // int32 stab_defence = 6;
  if (this->_internal_stab_defence() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<6>(
            stream, this->_internal_stab_defence(), target);
  }

  // int32 slash_defence = 7;
  if (this->_internal_slash_defence() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<7>(
            stream, this->_internal_slash_defence(), target);
  }

  // int32 crush_defence = 8;
  if (this->_internal_crush_defence() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<8>(
            stream, this->_internal_crush_defence(), target);
  }

  // int32 ranged_defence = 9;
  if (this->_internal_ranged_defence() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<9>(
            stream, this->_internal_ranged_defence(), target);
  }

  // int32 magic_defence = 10;
  if (this->_internal_magic_defence() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<10>(
            stream, this->_internal_magic_defence(), target);
  }

  // int32 melee_strength = 11;
  if (this->_internal_melee_strength() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<11>(
            stream, this->_internal_melee_strength(), target);
  }

  // int32 ranged_strength = 12;
  if (this->_internal_ranged_strength() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<12>(
            stream, this->_internal_ranged_strength(), target);
  }

  // double magic_damage = 13;
  static_assert(sizeof(::uint64_t) == sizeof(double),
                "Code assumes ::uint64_t and double are the same size.");
  double tmp_magic_damage = this->_internal_magic_damage();
  ::uint64_t raw_magic_damage;
  memcpy(&raw_magic_damage, &tmp_magic_damage, sizeof(tmp_magic_damage));
  if (raw_magic_damage != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteDoubleToArray(
        13, this->_internal_magic_damage(), target);
  }

  // int32 prayer = 14;
  if (this->_internal_prayer() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::
        WriteInt32ToArrayWithField<14>(
            stream, this->_internal_prayer(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target =
        ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
            _internal_metadata_.unknown_fields<::google::protobuf::UnknownFieldSet>(::google::protobuf::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:github.nkibler7.osrswikiscraper.StatBonuses)
  return target;
}

::size_t StatBonuses::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:github.nkibler7.osrswikiscraper.StatBonuses)
  ::size_t total_size = 0;

  ::uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // int32 stab_attack = 1;
  if (this->_internal_stab_attack() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_stab_attack());
  }

  // int32 slash_attack = 2;
  if (this->_internal_slash_attack() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_slash_attack());
  }

  // int32 crush_attack = 3;
  if (this->_internal_crush_attack() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_crush_attack());
  }

  // int32 ranged_attack = 4;
  if (this->_internal_ranged_attack() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_ranged_attack());
  }

  // int32 magic_attack = 5;
  if (this->_internal_magic_attack() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_magic_attack());
  }

  // int32 stab_defence = 6;
  if (this->_internal_stab_defence() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_stab_defence());
  }

  // int32 slash_defence = 7;
  if (this->_internal_slash_defence() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_slash_defence());
  }

  // int32 crush_defence = 8;
  if (this->_internal_crush_defence() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_crush_defence());
  }

  // int32 ranged_defence = 9;
  if (this->_internal_ranged_defence() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_ranged_defence());
  }

  // int32 magic_defence = 10;
  if (this->_internal_magic_defence() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_magic_defence());
  }

  // int32 melee_strength = 11;
  if (this->_internal_melee_strength() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_melee_strength());
  }

  // int32 ranged_strength = 12;
  if (this->_internal_ranged_strength() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_ranged_strength());
  }

  // double magic_damage = 13;
  static_assert(sizeof(::uint64_t) == sizeof(double),
                "Code assumes ::uint64_t and double are the same size.");
  double tmp_magic_damage = this->_internal_magic_damage();
  ::uint64_t raw_magic_damage;
  memcpy(&raw_magic_damage, &tmp_magic_damage, sizeof(tmp_magic_damage));
  if (raw_magic_damage != 0) {
    total_size += 9;
  }

  // int32 prayer = 14;
  if (this->_internal_prayer() != 0) {
    total_size += ::_pbi::WireFormatLite::Int32SizePlusOne(
        this->_internal_prayer());
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::google::protobuf::Message::ClassData StatBonuses::_class_data_ = {
    StatBonuses::MergeImpl,
    nullptr,  // OnDemandRegisterArenaDtor
};
const ::google::protobuf::Message::ClassData* StatBonuses::GetClassData() const {
  return &_class_data_;
}

void StatBonuses::MergeImpl(::google::protobuf::Message& to_msg, const ::google::protobuf::Message& from_msg) {
  auto* const _this = static_cast<StatBonuses*>(&to_msg);
  auto& from = static_cast<const StatBonuses&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:github.nkibler7.osrswikiscraper.StatBonuses)
  ABSL_DCHECK_NE(&from, _this);
  ::uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if (from._internal_stab_attack() != 0) {
    _this->_internal_set_stab_attack(from._internal_stab_attack());
  }
  if (from._internal_slash_attack() != 0) {
    _this->_internal_set_slash_attack(from._internal_slash_attack());
  }
  if (from._internal_crush_attack() != 0) {
    _this->_internal_set_crush_attack(from._internal_crush_attack());
  }
  if (from._internal_ranged_attack() != 0) {
    _this->_internal_set_ranged_attack(from._internal_ranged_attack());
  }
  if (from._internal_magic_attack() != 0) {
    _this->_internal_set_magic_attack(from._internal_magic_attack());
  }
  if (from._internal_stab_defence() != 0) {
    _this->_internal_set_stab_defence(from._internal_stab_defence());
  }
  if (from._internal_slash_defence() != 0) {
    _this->_internal_set_slash_defence(from._internal_slash_defence());
  }
  if (from._internal_crush_defence() != 0) {
    _this->_internal_set_crush_defence(from._internal_crush_defence());
  }
  if (from._internal_ranged_defence() != 0) {
    _this->_internal_set_ranged_defence(from._internal_ranged_defence());
  }
  if (from._internal_magic_defence() != 0) {
    _this->_internal_set_magic_defence(from._internal_magic_defence());
  }
  if (from._internal_melee_strength() != 0) {
    _this->_internal_set_melee_strength(from._internal_melee_strength());
  }
  if (from._internal_ranged_strength() != 0) {
    _this->_internal_set_ranged_strength(from._internal_ranged_strength());
  }
  static_assert(sizeof(::uint64_t) == sizeof(double),
                "Code assumes ::uint64_t and double are the same size.");
  double tmp_magic_damage = from._internal_magic_damage();
  ::uint64_t raw_magic_damage;
  memcpy(&raw_magic_damage, &tmp_magic_damage, sizeof(tmp_magic_damage));
  if (raw_magic_damage != 0) {
    _this->_internal_set_magic_damage(from._internal_magic_damage());
  }
  if (from._internal_prayer() != 0) {
    _this->_internal_set_prayer(from._internal_prayer());
  }
  _this->_internal_metadata_.MergeFrom<::google::protobuf::UnknownFieldSet>(from._internal_metadata_);
}

void StatBonuses::CopyFrom(const StatBonuses& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:github.nkibler7.osrswikiscraper.StatBonuses)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

PROTOBUF_NOINLINE bool StatBonuses::IsInitialized() const {
  return true;
}

::_pbi::CachedSize* StatBonuses::AccessCachedSize() const {
  return &_impl_._cached_size_;
}
void StatBonuses::InternalSwap(StatBonuses* PROTOBUF_RESTRICT other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  ::google::protobuf::internal::memswap<
      PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.prayer_)
      + sizeof(StatBonuses::_impl_.prayer_)
      - PROTOBUF_FIELD_OFFSET(StatBonuses, _impl_.stab_attack_)>(
          reinterpret_cast<char*>(&_impl_.stab_attack_),
          reinterpret_cast<char*>(&other->_impl_.stab_attack_));
}

::google::protobuf::Metadata StatBonuses::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_stat_5fbonuses_2eproto_getter, &descriptor_table_stat_5fbonuses_2eproto_once,
      file_level_metadata_stat_5fbonuses_2eproto[0]);
}
// @@protoc_insertion_point(namespace_scope)
}  // namespace osrswikiscraper
}  // namespace nkibler7
}  // namespace github
namespace google {
namespace protobuf {
}  // namespace protobuf
}  // namespace google
// @@protoc_insertion_point(global_scope)
#include "google/protobuf/port_undef.inc"
